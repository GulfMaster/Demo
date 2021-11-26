package com.wenbo.demo.str;

import cn.hutool.core.util.StrUtil;

/**
 * @author: liwenbo
 * @date: 2021-10-15 16:38:06
 * @desc:
 */
public class UrlPortSplit {
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
        String url1 = "189.1.2.3:80";
        String url2 = "189.1.2.3:132";
        String url3 = "189.1.2.3";
        String url4 = "http://189.1.2.3:80";
        String url5 = "http://189.1.2.3";
        String url6 = "https://189.1.2.3:80";
        String url7 = "https://189.1.2.3";
        String url8 = null;
        String url9 = "";

        System.out.println(splitColon(url1));
        System.out.println(splitColon(url2));
        System.out.println(splitColon(url3));
        System.out.println(splitColon(url4));
        System.out.println(splitColon(url5));
        System.out.println(splitColon(url6));
        System.out.println(splitColon(url7));
        System.out.println(splitColon(url8));
        System.out.println(splitColon(url9));
    }

    /**
     * 去除端口信息
     * @param url
     * @return
     */
    private static String splitColon(String url) {
        if (StrUtil.isEmpty(url)) {
            return url;
        }
        int index = 0;
        if(url.startsWith(PREFIX_HTTP)){
            index = url.substring(PREFIX_HTTP.length()).lastIndexOf(SEPARATOR_PORT);
            return index > 0 ? url.substring(0, index+PREFIX_HTTP.length()) : url;
        }else if(url.startsWith(PREFIX_HTTPS)){
            index = url.substring(PREFIX_HTTPS.length()).lastIndexOf(SEPARATOR_PORT);
            return index > 0 ? url.substring(0, index+PREFIX_HTTPS.length()) : url;
        }
        index = url.lastIndexOf(SEPARATOR_PORT);
        return index > 0 ? url.substring(0, index) : url;
    }
}
