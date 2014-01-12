/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.jcp.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类Graunt.java的实现描述：TODO 类实现描述 
 * @author yangqi Jan 12, 2014 6:23:06 PM
 */
public class Graunt extends Thread {

    private CyclicBarrier barrier = null;

    private static AtomicInteger nextId  = new AtomicInteger();

    private int                  id      = 0;

    public Graunt(CyclicBarrier barrier) {
        id = nextId.incrementAndGet();
        this.barrier = barrier;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Gruant " + id + " is waiting");
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Gruant " + id + " is attacking");
    }
}
