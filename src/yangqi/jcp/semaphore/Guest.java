/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.jcp.semaphore;

import java.util.concurrent.Semaphore;

/**
 * 类Guest.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 16, 2013 9:32:14 PM
 */
public class Guest implements Runnable {

    private int id;

    private Semaphore seatCountLock;

    public Guest(int id, Semaphore seatCountLock) {
        this.id = id;
        this.seatCountLock = seatCountLock;
    }
    public void takeSeat() {
        System.out.println("Guest [ " + id + " ] Take Seat Now");
    }

    public void leave() {
        System.out.println("Guest [ " + id + " ] Leave Now");
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        try {
            System.out.println("About " + seatCountLock.getQueueLength() + " Guest Are Waiting");
            seatCountLock.acquire();
            takeSeat();
            Thread.sleep(100);
            leave();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            seatCountLock.release();
        }


    }
}
