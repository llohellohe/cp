/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 类StringSwitch.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 17, 2013 8:02:56 PM
 */
public class StringSwitch {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name = "yangqi";

        switch (name) {

        }

        List<String> list = new ArrayList<>();

        list.add("abc");
        
        String s1 = "Good";
        s1 = s1 + "morning";
        System.out.println(s1.intern());
        String s2 = "Goodmorning";
        System.out.println(s1 == s2);
    }

}
