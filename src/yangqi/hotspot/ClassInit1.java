/*
 * Copyright 1999-2012 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.hotspot;

/**
 * 类ClassInit1.java的实现描述：TODO 类实现描述
 * 
 * @author yangqi 2012-7-29 下午09:38:48
 */
public class ClassInit1 {

    static int a = 200; // 1)如果不赋值呢？ 2)如果这一句与上一句位置互换？
    static {
        a = 30000;
    }

    public static void main(String[] args) {
        System.out.println(ClassInit1.a);
    }

}
