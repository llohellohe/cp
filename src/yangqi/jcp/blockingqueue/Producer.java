/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp.blockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * @author yangqi 2012-2-22 ÏÂÎç08:49:19
 */
public class Producer implements Runnable {

    private final BlockingQueue<String> workQueue;
    private int                         workId;
    private int                         processId = 0;

    public Producer(BlockingQueue workQueue, int workId) {
        this.workQueue = workQueue;
        this.workId = workId;
    }

    public void addTask() {
        String workString = "producer with [" + workId + "]-------------" + (processId++);
        System.out.println(workString);
        workQueue.offer(workString);
    }

    @Override
    public void run() {
        while (true) {
            addTask();
            try {
                Random rand = new Random();

                Thread.currentThread().sleep(1000 * rand.nextInt(5));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
