package com.wenbo.util;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author: liwenbo
 * @date: 2021-10-26 17:03:45
 * @desc: es 查询参数构建工具类
 */
public class EsParamUtil {
    /**
     * 部门 id 分隔符
     */
    private static final String DEPT_DELIMITER = ",";
    /**
     * 全路径模糊查询后缀
     */
    private static final String FUZZY_QUERY_SUFFIX = ",*";

    /**
     * 获取 ES 查询时间参数
     * @param date
     * @return yyyy-MM-dd HH:mm:ss.SSS 格式时间
     */
    public static String getEsSearchTimeStr(Date date){
        return DateUtil.format(date, StartTimeUtil.DATE_FORMAT_MILLISECOND);
    }
}
