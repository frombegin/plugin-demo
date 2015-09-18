package com.xw.biz.core;


/**
 * 可持续化接口
 *
 * @author $Id$
 * @version 1.0
 * @updated 18-九月-2015 22:11:29
 */
public interface Persistent {

    /**
     * 保存
     */
    public void save();

    /**
     * 装载
     */
    public void load();

    /**
     * 删除
     */
    public void delete();

    /**
     * 获取实例 ID
     */
    public int getId();

    /**
     * 设置实例 ID
     *
     * @param id
     */
    public void setId(int id);

}