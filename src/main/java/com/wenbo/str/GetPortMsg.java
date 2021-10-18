package com.wenbo.str;

import cn.hutool.core.util.StrUtil;

/**
 * @author: liwenbo
 * @date: 2021-10-18 15:35:18
 * @desc: 获取 URL 中的端口信息
 */
public class GetPortMsg {
    /**
     * http 前缀
     */
    private static final String PREFIX_HTTP = "http://";
    /**
     * https 前缀
     */
    private static final String PREFIX_HTTPS = "https://";
    /**
     * 端口分割符号
     */
    private static final char SEPARATOR_PORT = ':';

    public static void main(String[] args) {
        System.out.println(getPort("127.0.0.1:80"));
        System.out.println(getPort("127.0.0.1"));
        System.out.println(getPort("127.0.0.1:9777"));
        System.out.println(getPort("127.0.0.1:8888"));
    }

    private static String getPort(String url) {
        if (StrUtil.isEmpty(url)) {
            return null;
        }
        String[] strs = url.split(":");
        return strs.length > 1 ? strs[1] : "80";
    }
}
