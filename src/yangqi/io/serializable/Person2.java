/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.io.serializable;

import java.io.Serializable;

/**
 * 类Person.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 14, 2013 6:16:00 PM
 */
public class Person2 implements Serializable {

    private static final long serialVersionUID = -2826110927649084117L;

    private String name;

    private int    age;

    Person2() {
        System.out.println("initing person...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
