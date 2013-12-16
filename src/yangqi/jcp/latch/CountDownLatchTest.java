/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yangqi 2012-2-25 05:23:34
 */
public class CountDownLatchTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int size = 3;
        CountDownLatch latch = new CountDownLatch(size);


        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < size; i++) {
            executor.execute(new Worker("worker" + i, 1040, latch));
        }

        try {
            latch.await();
        } catch (InterruptedException e) { // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("ALL WORK FINISHED");

    }

}
