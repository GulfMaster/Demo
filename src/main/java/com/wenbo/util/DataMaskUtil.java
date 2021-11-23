package com.wenbo.util;

/**
 * @author: liwenbo
 * @date: 2021-11-23 15:05:05
 * @desc: 数据脱敏工具类
 */
public class DataMaskUtil {
    /**
     * 实现前三后四脱敏
     * @param msg
     * @return
     */
    public static String maskPhone(String msg){
        return msg.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
    }

    public static void main(String[] args) {
        System.out.println(maskPhone("17700001234"));
    }
}
