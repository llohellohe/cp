/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 类LinkedHashMapTest.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 15, 2013 2:19:18 PM
 */
public class HashMapTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, String.valueOf(i));
        }

        for (String key : map.keySet()) {
            System.out.println("key is " + key);
        }

    }

}
