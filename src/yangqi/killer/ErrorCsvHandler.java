package yangqi.killer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
/**
 * this code is written by yangqi
 * 
 * @author yangqi 2012-2-15 下午02:09:26
 */
public class ErrorCsvHandler {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        new ErrorCsvHandler().change("/sharetowin/xuyan.caixy-20120215kristyproduct.csv", "/sharetowin/new.csv");
    }

    private void change(String fileName, String newFileName) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "gbk"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFileName), "gbk"));
        String title = reader.readLine();

        System.out.println(title);
        writer.write(title + "\n");

        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",", -1);
            int length = data.length;

            // System.out.println(data[length - 2]);

            if (length > 11) {

                // int endIndex = length - 2;
                int endIndex = length - 6;
                int startIndex = 4;
                StringBuffer dataBuffer = new StringBuffer();
                for (int i = 0; i < startIndex; i++) {
                    dataBuffer.append(data[i]).append(",");
                }

                // System.out.println(data[length - 6]);

                for (int i = startIndex; i < endIndex; i++) {
                    dataBuffer.append(data[i]).append("|");
                }
                dataBuffer.append(",");

                for (int i = endIndex; i < length; i++) {
                    dataBuffer.append(data[i]).append(",");
                }
                dataBuffer.append("\n");

                writer.write(dataBuffer.toString());
            } else {
                writer.write(line + "\n");
            }

        }

        reader.close();
        writer.close();
    }
}
