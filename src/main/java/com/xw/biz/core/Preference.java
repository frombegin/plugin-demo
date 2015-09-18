package com.xw.biz.core;


/**
 * 偏好
 *
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 21:54:01
 */
public class Preference {

    /**
     * 偏好 ID
     */
    private int id;
    /**
     * 资源 Id
     */
    private int resourceId;
    /**
     * 插件 Id
     */
    private PluginId pluginId;
    /**
     * 偏好内容（插件有关）
     */
    public PreferenceSpec spec;

    public Preference() {

    }

}