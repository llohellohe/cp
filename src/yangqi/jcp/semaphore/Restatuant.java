/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.jcp.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 类Restatuant.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 16, 2013 9:35:38 PM
 */
public class Restatuant {

    private Semaphore seatCountLock;

    public Restatuant(int seatCount) {
        seatCountLock = new Semaphore(seatCount);
    }

    public void welcomeGuest() throws InterruptedException {
        ExecutorService excutor = Executors.newCachedThreadPool();

        for (int i = 0; i <= 113; i++) {
            excutor.execute(new Guest(i, seatCountLock));
        }

        Thread.sleep(1000 * 10);
        excutor.shutdown();

        System.out.println("Still Aviable Seat Count :" + seatCountLock.availablePermits());
    }
}
