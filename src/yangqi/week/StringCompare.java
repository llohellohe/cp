/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.week;

/**
 * @author yangqi 2012-5-16 下午09:34:00
 */
public class StringCompare {

    /**
     * @param args
     */
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
        part5();
    }

    public static void part1() {

        String s1 = String.valueOf(140);

        String s2 = String.valueOf(140);

        System.out.println(s1 == s2);
    }

    public static void part2() {
        String s1 = new String("140");

        String s2 = new String("140");

        System.out.println(s1 == s2);
    }

    public static void part3() {
        String s1 = "140";

        String s2 = "140";

        System.out.println(s1 == s2);
    }

    public static void part4() {

        /** 编译器直接优化成hello world **/
        String s1 = "hello" + " world";

        String s2 = "hello world";

        System.out.println(s1 == s2);
    }

    public static void part5() {

        String temp1 = "hello";

        String temp2 = " world";

        /** 编译器会优化成StringBuilder.append操作，每次都是new 出来的 **/
        String s1 = temp1 + temp2;

        String s2 = "hello world";

        System.out.println(s1 == s2);
    }
}
