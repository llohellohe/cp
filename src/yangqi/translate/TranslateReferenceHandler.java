package yangqi.translate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
/**
 * this code is written by yangqi
 * 
 * @author yangqi 2012-2-13 下午05:13:10
 */
public class TranslateReferenceHandler {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        TranslateReferenceHandler handler = new TranslateReferenceHandler();
        Map<String, TransResult> transResultMap = handler.getTransResult("/tmp/101");

        System.out.println(transResultMap.size());

        for (String lang : Arrays.asList("de", "it", "fr", "es", "pt", "ru", "ko", "ja", "ar")) {
            handler.addTranslate("/tmp/attribute.name", lang, transResultMap);
        }

    }

    public void addTranslate(String fileName, String lang, Map<String, TransResult> transResultMap) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "-" + lang + ".csv"));

        String line = reader.readLine();
        StringBuilder title = new StringBuilder(line);
        title.append(",");
        title.append(lang);
        title.append("\n");
        writer.write(title.toString());
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");

            StringBuilder builder = new StringBuilder(line);
            // System.out.println(line);
            String key = data[1].toLowerCase() + "~" + lang;

            if (transResultMap.containsKey(key)) {
                builder.append(",");
                TransResult local = transResultMap.get(key);
                builder.append(local.getLocal());
            }

            builder.append("\n");

            writer.write(builder.toString());

        }

        reader.close();
        writer.close();
    }

    public Map<String, TransResult> getTransResult(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        Map<String, TransResult> resultMap = new HashMap<String, TransResult>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\\|\\|\\|");
            if (data.length < 3) {
                continue;

            }
            TransResult ret = new TransResult();
            ret.setEnlish(data[0]);
            ret.setLocale(data[1]);
            ret.setLocal(data[2]);

            resultMap.put(data[0].toLowerCase() + "~" + ret.getLocale(), ret);
        }

        reader.close();

        return resultMap;
    }

    class TransResult {

        private String enlish;
        private String local;
        private String locale;

        /**
         * @return the enlish
         */
        public String getEnlish() {
            return enlish;
        }

        /**
         * @param enlish the enlish to set
         */
        public void setEnlish(String enlish) {
            this.enlish = enlish;
        }

        /**
         * @return the local
         */
        public String getLocal() {
            return local;
        }

        /**
         * @param local the local to set
         */
        public void setLocal(String local) {
            this.local = local;
        }

        /**
         * @return the locale
         */
        public String getLocale() {
            return locale;
        }

        /**
         * @param locale the locale to set
         */
        public void setLocale(String locale) {
            this.locale = locale;
        }

    }

}
