package com.wenbo.util;

/**
 * @author: liwenbo
 * @date: 2021-11-18 09:50:44
 * @desc: 
 */
public class BroadcastIPUtil {
    public static void main(String[] args) {
        System.out.println(isBroadcastIp("255.255.255.255"));
        System.out.println(isBroadcastIp("255.255.123.255"));
        System.out.println(isBroadcastIp("255.255.255.0"));
        System.out.println(isBroadcastIp("255.255.255.00"));
    }

    /**
     * 判断ip是否为广播ip
     * @param ip
     * @return
     */
    public static boolean isBroadcastIp(String ip){
        return ip.endsWith(".255") || ip.endsWith(".0");
    }
}
