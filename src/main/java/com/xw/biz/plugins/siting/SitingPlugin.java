package com.xw.biz.plugins.siting;

import com.xw.biz.core.PreferenceSpec;
import com.xw.biz.core.ServiceSpec;
import com.xw.biz.core.RequirementSepc;
import com.xw.biz.core.BasePlugin;

/**
 * @author baohua
 * @version 1.0
 * @created 18-九月-2015 22:10:21
 */
public class SitingPlugin extends BasePlugin {


    public static final String NAME = "找店";
    public static final String DESCRIPTION = "找店插件：定义找店相关的资源与服务";


    public SitingPlugin() {

    }

    /**
     * 获取描述
     */
    public String getDescription() {
        return DESCRIPTION;
    }

    /**
     * 获取名称
     */
    public String getName() {
        return NAME;
    }

    /**
     * 获取版本号
     */
    public int getVersion() {
        return 0;
    }

    /**
     * 创建偏好规范
     *
     * @return
     */
    public PreferenceSpec createPreferenceSpec() {

        return new SitingPreferenceSpec();
    }

    /**
     * 创建需求规范
     *
     * @return
     */
    public RequirementSepc createRequirementSpec() {

        return new SitingRequirementSpec();
    }

    /**
     * 创建服务规范
     *
     * @return
     */
    public ServiceSpec createServiceSpec() {

        return new SitingServiceSpec();
    }

}