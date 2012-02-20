/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp;

import java.util.Collection;

/**
 * @author yangqi 2012-2-20 ÏÂÎç09:31:36
 */
public class ConcurrentModifier {

    private Collection<String> collection;

    public ConcurrentModifier(Collection<String> collection) {
        this.collection = collection;
        demon();
    }

    public void demon() {
        new Thread(new Worker()).start();
    }

    class Worker implements Runnable {

        @Override
        public void run() {
            int count = 10;
            while (count < 10000) {

                // System.out.println("add " + count);
                collection.add("add " + count);
                count++;
            }
        }

    }
}
