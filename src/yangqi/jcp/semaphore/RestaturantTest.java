/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.jcp.semaphore;


/**
 * 类SemaphoreTest.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 16, 2013 9:30:50 PM
 */
public class RestaturantTest {

    
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        final Restatuant restatuant = new Restatuant(10);


        restatuant.welcomeGuest();
    }

}
