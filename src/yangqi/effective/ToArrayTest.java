/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package yangqi.effective;

import java.util.ArrayList;
import java.util.List;

/**
 * 类ToArrayTest.java的实现描述：TODO 类实现描述 
 * @author yangqi 2013-2-6 下午7:34:25
 */
public class ToArrayTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer>list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        Integer[]array=(Integer[]) list.toArray(new Integer[0]);
        
        System.out.println(array.length
                           );
        
        for(Integer i:array){
           System.out.print(i+","); 
        }
    }

}
