package com.wenbo.demo.str;

import java.io.UnsupportedEncodingException;

/**
 * @author: liwenbo
 * @date: 2021-10-17 22:19:30
 * 
 * @desc: 编码格式转换
 */
public class CharsetChange {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str =  "白日依山尽";
        String str2 = new String(str.getBytes("GBK"),"UTF-8");
        System.out.println(str);
        System.out.println(str2);
    }
}
