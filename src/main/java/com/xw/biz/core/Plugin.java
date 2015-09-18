package com.xw.biz.core;


/**
 * 插件
 *
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 21:40:45
 */
public interface Plugin extends ServiceSpecProvider, RequirementSpecProvider, PreferenceSpecProvider {

    /**
     * 获取名称
     */
    public String getName();

    /**
     * 获取描述
     */
    public String getDescription();

    /**
     * 获取版本号
     */
    public int getVersion();

}