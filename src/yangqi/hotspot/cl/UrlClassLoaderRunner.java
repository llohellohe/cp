/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.hotspot.cl;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;


/**
 * 类UrlClassLoaderRunner.java的实现描述：TODO 类实现描述 
 * @author yangqi 2013-2-6 下午7:18:37
 */
public class UrlClassLoaderRunner {

    /**
     * @param args
     * @throws MalformedURLException 
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        
        URL[]urls=new URL[]{new URL("file:///Users/yangqi/opensource/cp/src/yangqi/hotspot/pac2/")};
        ClassLoader classLoader=new URLClassLoader(urls,Thread.currentThread().getContextClassLoader());
        
        classLoader.loadClass("yangqi.hotspot.pac2.Class2");
        
        classLoader.loadClass("yangqi.hotspot.pac1.Class1");
    }

}
