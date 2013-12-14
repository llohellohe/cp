/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.io.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 类SerializableTest.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 14, 2013 6:18:18 PM
 */
public class DeSerializableTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("/tmp/abc");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person2 p = (Person2) ois.readObject();
        System.out.println(p.getName());

    }

}
