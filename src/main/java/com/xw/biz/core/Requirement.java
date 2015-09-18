package com.xw.biz.core;


/**
 * 商户需求
 *
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 21:57:20
 */
public class Requirement {

    /**
     * 需求 ID
     */
    private int id;
    /**
     * 服务 ID
     */
    private int serviceId;
    /**
     * 插件 ID
     */
    private PluginId pluginId;
    /**
     * 需求状态
     */
    private RequirementStatus status;
    /**
     * 需求内容（插件相关）
     */
    public RequirementSepc spec;

    public Requirement() {

    }

}