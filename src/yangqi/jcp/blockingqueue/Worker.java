/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * @author yangqi 2012-2-22 ����09:03:31
 */
public class Worker implements Runnable {

    private final BlockingQueue<String> workQueue;
    private int workerId;

    public Worker(BlockingQueue workQueue, int workerId) {
        this.workQueue = workQueue;
        this.workerId = workerId;
        int i = 0;
        int j = 10;
        int x = 20;
    }

    @Override
    public void run() {
        while (true) {
            String workString = workQueue.poll();
            if (workString != null) {

                System.out.println("worker with[" + workerId + "]process with " + workString);

            }

        }

    }

}
