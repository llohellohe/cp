/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp.latch;

import java.util.concurrent.CountDownLatch;

/**
 * @author yangqi 2012-2-25 ÏÂÎç05:23:34
 */
public class TestLatch {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int size = 3;
        CountDownLatch latch = new CountDownLatch(size);

        new Worker("worker1", 11000, latch).start();
        new Worker("worker2", 20000, latch).start();
        new Worker("worker3", 10400, latch).start();

        try {
            latch.await();
        } catch (InterruptedException e) { // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.err.println("ALL WORK FINISHED");

    }

}
