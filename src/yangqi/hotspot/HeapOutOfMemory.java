/*
 * Copyright 1999-2012 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.hotspot;

import java.util.ArrayList;
import java.util.List;

/**
 * 类HeapOutOfMemory.java的实现描述：TODO 类实现描述
 * 
 * @author yangqi 2012-7-23 下午10:15:32
 */
public class HeapOutOfMemory {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        while (true)
            list.add(new String("Consume more memory!"));
    }

}
