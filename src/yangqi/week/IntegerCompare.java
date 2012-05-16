/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.week;

/**
 * @author yangqi 2012-5-16 ÏÂÎç09:34:00
 */
public class IntegerCompare {

    /**
     * @param args
     */
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
    }

    public static void part1() {

        Integer i1 = Integer.valueOf(140);

        Integer i2 = Integer.valueOf(140);

        System.out.println(i1 == i2);
    }

    public static void part2() {
        Integer i1 = new Integer(4);

        Integer i2 = new Integer(4);

        System.out.println(i1 == i2);
    }

    public static void part3() {
        Integer i1 = 4;

        Integer i2 = 4;

        System.out.println(i1 == i2);
    }

    public static void part4() {

        Integer i1 = Integer.valueOf(4);

        Integer i2 = Integer.valueOf(4);

        System.out.println(i1 == i2);
    }
}
