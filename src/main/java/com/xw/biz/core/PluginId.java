package com.xw.biz.core;


/**
 * 插件 ID
 *
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 21:34:48
 */
public final class PluginId {

    /**
     * 厂商标识
     */
    private String vendor;
    /**
     * 唯一标识
     */
    private String id;

    public PluginId() {
        this.vendor = "unknown";
        this.id = "unknown";
    }

    public PluginId(String vendor, String id) {
        this.vendor = vendor;
        this.id = id;
    }

    public static PluginId parse(String str) {
        // TODO: 解析字符串, 格式: "vendor:id"
        return null;
    }

    @Override
    public String toString() {
        return vendor + ':' + id;
    }

    /**
     * 判断是否是 ALL ("all:all") 标识, ALL 代表所有插件
     */
    public boolean isAll() {
        return false;
    }

    /**
     * 判断是否是 Vendor ALL ("vendor:all") 标识, Vendor ALL 代表指定厂商的所有插件
     */
    public boolean isVendorAll() {
        return false;
    }

    /**
     * 判断是否是一个明确的插件
     */
    public boolean isSpecific() {
        return false;
    }

    /**
     * 获取厂商
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * 设置厂商
     *
     * @param vendor
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * 获取 ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

}