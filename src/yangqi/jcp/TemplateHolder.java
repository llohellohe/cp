/*
 * Copyright 1999-2011 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package yangqi.jcp;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author yangqi 2012-2-20 ÏÂÎç09:24:40
 */
public class TemplateHolder {

    private Collection<String> templates = new HashSet<String>();

    public TemplateHolder() {
        for (int i = 0; i < 10; i++) {
            templates.add("template " + i);
        }
    }

    public void addTemplate(String name) {
        templates.add(name);

    }

    public Collection<String> getTemplates() {
        return templates;
    }

    public void setTemplates(Collection<String> templates) {
        this.templates = templates;
    }

}
