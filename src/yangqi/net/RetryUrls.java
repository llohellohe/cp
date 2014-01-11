/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.net;

import java.net.URL;
import java.net.URLConnection;

/**
 * 类RetryUrls.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 17, 2013 10:26:37 PM
 */
public class RetryUrls {

    private static int currentRetryCount = 0;
    
    public static void main(String[] args) throws InterruptedException {
        retryRead(20);
    }

    public static void retryRead(int maxRetryCount) throws InterruptedException {
        if (currentRetryCount <= maxRetryCount) {
            try {
                System.out.println("try count " + currentRetryCount);
                URLConnection conn;
                conn = new URL("").openConnection();
                conn.setReadTimeout(5000);
                conn.getInputStream();
                // if nothing happens,it just return
                return;
            } catch (Exception e) {
                // if exception raises,it will try again after 5 seconds
                // Thread.sleep(5000);

                currentRetryCount++;
                retryRead(maxRetryCount);
            }
        }
    }

}
