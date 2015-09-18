package com.xw.biz.core;


/**
 * 插件管理器
 *
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 21:44:59
 */
public class PluginManager {

    public PluginManager() {

    }

    /**
     * 注册插件
     *
     * @param id     插件 ID
     * @param plugin 插件实例
     */
    public void registerPlugin(PluginId id, Plugin plugin) {

    }

    /**
     * 获取插件
     *
     * @param pluginId 插件 ID
     */
    public Plugin getPlugin(PluginId pluginId) throws PluginNotFoundException {
        //TODO: 获取插件或者抛出异常
        return null;
    }


    public PreferenceSpec createPreferenceSpec(PluginId pluginId) {
        return getPlugin(pluginId).createPreferenceSpec();
    }

    public RequirementSepc createRequirementSpec(PluginId pluginId) {
        return getPlugin(pluginId).createRequirementSpec();
    }

    public ServiceSpec createServiceSpec(PluginId pluginId) {
        return getPlugin(pluginId).createServiceSpec();
    }

}