package com.xw.biz.core;


import java.sql.Timestamp;

/**
 * 商户服务
 *
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 22:02:08
 */
public class Service {

    /**
     * 插件 ID
     */
    private PluginId pluginId;
    /**
     * 服务 ID
     */
    private int id;
    /**
     * 创建于
     */
    private Timestamp createdAt;
    /**
     * 开始于
     */
    private Timestamp startAt;
    /**
     * 结束于
     */
    private Timestamp endAt;
    /**
     * 服务状态
     */
    private ServiceStatus status;
    /**
     * 服务内容(插件相关)
     */
    public ServiceSpec spec;

    public Service() {

    }

}