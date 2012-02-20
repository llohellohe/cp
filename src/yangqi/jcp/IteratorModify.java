/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp;

import java.util.Collection;

/**
 * @author yangqi 2012-2-20 ÏÂÎç09:24:10
 */
public class IteratorModify {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TemplateHolder holder = new TemplateHolder();

        new ConcurrentModifier(holder.getTemplates());

        new ConcurrentModifier(holder.getTemplates());

        int i = 0;
        while (i <= 100000) {
            Collection<String> templates = holder.getTemplates();
            // solved this problem
            // synchronized (templates) {
            for (String name : templates) {
                System.out.println("show " + name);
            }
            // }
            i++;
        }
    }
}
