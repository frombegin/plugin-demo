package com.xw.biz.core.matcher;


/**
 * 匹配器
 * @author $Id$
 * @version 1.0
 * @created 18-九月-2015 21:29:04
 */
public interface Matcher {

	/**
	 * 
	 * @param pluginId
	 * @param reqId
	 * @param maxResult
	 */
	public Pagination<MatchResult> match(PluginId pluginId, int reqId, int maxResult);

}