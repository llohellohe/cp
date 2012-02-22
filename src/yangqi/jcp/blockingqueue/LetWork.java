/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author yangqi 2012-2-22 ÏÂÎç09:09:16
 */
public class LetWork {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BlockingQueue<String> queue = new LinkedBlockingQueue<String>();

        for (int i = 0; i < 10; i++) {
            new Thread(new Producer(queue, i)).start();
        }

        for (int i = 0; i < 2; i++) {
            new Thread(new Worker(queue, i)).start();
        }
    }

}
