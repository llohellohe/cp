/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.hotspot.string;

/**
 * 类StringTest1.java的实现描述：TODO 类实现描述 
 * @author yangqi 2013-3-10 下午11:41:07
 */
public class StringTest1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String c = "c";

        String str1 = "a" + "b";

        String str2 = "a" + "b" + c;

        String str3 = "a" + "b" + "c";


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        StringBuilder sb = new StringBuilder();
        sb.append("ab").append(c);
        System.out.println(sb.toString());
        
        
        String str = "hello";
        for (int i = 0; i < 10000; ++i) {
            str = str + "hello" + i;
        }


    }

}
