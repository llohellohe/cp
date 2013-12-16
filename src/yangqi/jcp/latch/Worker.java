/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp.latch;

import java.util.concurrent.CountDownLatch;

/**
 * @author yangqi 2012-2-25 05:20:05
 */
public class Worker extends Thread {

    private CountDownLatch latch;
    private String         workName;
    private long           workTime;

    public Worker(String workName, long workTime, CountDownLatch latch) {

        this.latch = latch;
        this.workName = workName;
        this.workTime = workTime;

    }

    public void run() {
        System.out.println(workName + " start to work");
        try {
            Thread.sleep(workTime);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(workName + " finish work");

        latch.countDown();
    }
}
