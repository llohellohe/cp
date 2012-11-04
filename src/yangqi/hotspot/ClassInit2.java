/*
 * Copyright 1999-2012 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.hotspot;

/**
 * 绫�lassInit1.java����版�杩帮�TODO 绫诲��版�杩� * 
 * @author yangqi 2012-7-29 涓��09:38:48
 */
public class ClassInit2 {

    static {
        a = 3;
    }
    static int a=2 ; // 1)濡��涓���煎�锛�2)濡��杩���ヤ�涓���ヤ�缃�����

    public static void main(String[] args) {
        System.out.println(ClassInit2.a);
    }

}
