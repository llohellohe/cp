/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类ThreadLocalTest.java的实现描述：TODO 类实现描述
 * 
 * @author yangqi Jan 11, 2014 10:03:39 PM
 */
public class ThreadLocalTest extends Thread {

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {

                                                 private AtomicInteger counter = new AtomicInteger();

                                                 protected Integer initialValue() {
                                                     return counter.incrementAndGet();
                                                 }
                                             };

    public void run() {
        System.out.println(Thread.currentThread().getId() + " said:" + threadLocal.get());
        System.out.println(Thread.currentThread().getId() + " said:" + threadLocal.get());
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Thread t1 = new ThreadLocalTest();
        t1.start();

        Thread t2 = new ThreadLocalTest();
        t2.start();
    }

}
