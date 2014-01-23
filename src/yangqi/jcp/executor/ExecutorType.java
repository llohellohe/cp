/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.jcp.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 类ExecutorType.java的实现描述：TODO 类实现描述 
 * @author yangqi Jan 23, 2014 7:57:43 PM
 */
public class ExecutorType {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            Future f = executor.submit(new Runnable() {

                @Override
                public void run() {
                    System.out.println("hi");
                    try {
                        Thread.sleep(1000 * 1);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("over");
                }
            });
            System.out.println("task done ?" + f.isDone());
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("finish");

    }


}
