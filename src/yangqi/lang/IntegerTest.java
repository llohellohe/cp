/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.lang;

/**
 * 类IntegerTest.java的实现描述：TODO 类实现描述 
 * @author yangqi Nov 21, 2013 11:12:52 PM
 */
public class IntegerTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer int1 = Integer.valueOf(1);
        Integer int2 = Integer.valueOf(1);
        Integer int3 = Integer.valueOf(3000);
        Integer int4 = Integer.valueOf(3000);

        System.out.println("Integer int1 == int2 " + (int1 == int2));
        System.out.println("Integer int3 == int4 " + (int3 == int4));
    }

}
