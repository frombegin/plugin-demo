package com.xw.biz.core;


/**
 * 推荐
 *
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 21:57:32
 */
public class Recommendation {

    /**
     * 推荐 ID
     */
    private int id;
    /**
     * 需求 ID
     */
    private int requirementId;
    /**
     * 推荐人
     */
    public Middleman middleMan;
    /**
     * 匹配资源
     */
    public MatchedResource resource;

    public Recommendation() {

    }

}