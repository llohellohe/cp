/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.hotspot.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 类InternOOM.java的实现描述：TODO 类实现描述 
 * @author yangqi Dec 14, 2013 8:44:27 PM
 */
public class InternOOM {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 0;
        List<String> list = new ArrayList<String>();
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

}
