/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.effective;

import java.util.Map;

/**
 * @author yangqi 2012-3-3 ����10:32:56
 */
public class StaticFactory {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, Integer> map = MapUtil.newMap();

        map.put("yangqi", 18);

        System.out.println(map.get("yangqi"));

    }

}
