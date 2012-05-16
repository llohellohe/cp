/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.effective;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangqi 2012-3-3 обнГ10:33:22
 */
public class MapUtil {

    public static <K, V> Map<K, V> newMap() {
        return new HashMap<K, V>();
    }
}
