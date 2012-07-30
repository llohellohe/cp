/*
 * Copyright 1999-2012 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.hotspot;

/**
 * 类StaticLock.java的实现描述：TODO 类实现描述
 * 
 * @author yangqi 2012-7-29 下午09:55:11
 */
class Lock {
}

class Danger {

    static {
        System.out.println("clinit begin...");
        try {
            Thread.sleep(2000);
            System.out.println("clinit end after sleep...");
        } catch (Exception e) {
        }
        synchronized (Lock.class) {
            System.out.println("clinit done!");
        }
    }

    public void foo() {

    }
}

public class StaticLock {

    public static void main(String[] args) {
        new Thread() {

            public void run() {
                synchronized (Lock.class) {
                    System.out.println("new thread start!");
                    try {
                        Thread.sleep(1000);
                        System.out.println("new thread end !");
                    } catch (Exception e) {
                    }
                    System.out.println("new thread to new Danger !");
                    new Danger().foo();
                }
                System.out.println("new thread end!");
            }
        }.start();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        System.out.println("Old thread to new Danger !");
        new Danger().foo();
        System.out.println("DONE!");
    }
}
