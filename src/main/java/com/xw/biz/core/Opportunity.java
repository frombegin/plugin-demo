package com.xw.biz.core;


import java.sql.Timestamp;

/**
 * 商机
 *
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 21:38:30
 */
public class Opportunity {

    /**
     * 商机 ID
     */
    private int id;
    /**
     * 创建人 ID
     */
    private int creatorId;
    /**
     * 创建于
     */
    private Timestamp createdAt;
    /**
     * 插件 ID
     */
    private PluginId pluginId;
    /**
     * 商机内容（插件相关）
     */
    private RequirementSepc spec;

    public Opportunity() {

    }

}