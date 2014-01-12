/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.jcp.barrier;

import java.util.concurrent.CyclicBarrier;

/**
 * 在20个Graunt兽族步兵到达后，才发动攻击
 * 
 * @author yangqi Jan 12, 2014 6:22:21 PM
 */
public class CyclicBarrierTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CyclicBarrier cb = new CyclicBarrier(20);

        for (int i = 0; i < 20; i++) {
            new Graunt(cb).start();
        }
    }

}
