package com.wenbo.str;

import cn.hutool.core.util.StrUtil;

/**
 * @author: liwenbo
 * @date: 2021-10-18 16:31:02
 * @desc: 去除 http 前缀和端口号
 */
public class GetHost {
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
        System.out.println(getHost("http://baidu.com"));
        System.out.println(getHost("http://baidu.com:666"));
        System.out.println(getHost("http://1.2.3.4"));
        System.out.println(getHost("http://1.2.3.4:2345"));
        System.out.println(getHost("https://baidu.com"));
        System.out.println(getHost("https://baidu.com:666"));
        System.out.println(getHost("https://1.2.3.4"));
        System.out.println(getHost("https://1.2.3.4:2345"));
        System.out.println(getHost("baidu.com"));
        System.out.println(getHost("baidu.com:666"));
        System.out.println(getHost("1.2.3.4"));
        System.out.println(getHost("1.2.3.4:2345"));
    }

    /**
     * 将 url 中的 http 前缀和端口号去除
     */
    private static String getHost(String url) {
        if (StrUtil.isEmpty(url)) {
            return null;
        }
        // 去除端口信息
        url = removeColon(url);
        // 去除头部信息
        if (url.startsWith(PREFIX_HTTP)) {
            return url.substring(PREFIX_HTTP.length());
        } else if (url.startsWith(PREFIX_HTTPS)) {
            return url.substring(PREFIX_HTTPS.length());
        }
        return url;
    }
    /**
     * 去除 url 后的 ‘:’ 及数字
     */
    private static String removeColon(String url) {
        if (StrUtil.isEmpty(url)) {
            return url;
        }
        int index = 0;
        if (url.startsWith(PREFIX_HTTP)) {
            index = url.substring(PREFIX_HTTP.length()).lastIndexOf(SEPARATOR_PORT);
            return index > 0 ? url.substring(0, index + PREFIX_HTTP.length()) : url;
        } else if (url.startsWith(PREFIX_HTTPS)) {
            index = url.substring(PREFIX_HTTPS.length()).lastIndexOf(SEPARATOR_PORT);
            return index > 0 ? url.substring(0, index + PREFIX_HTTPS.length()) : url;
        }
        index = url.lastIndexOf(SEPARATOR_PORT);
        return index > 0 ? url.substring(0, index) : url;
    }
}
