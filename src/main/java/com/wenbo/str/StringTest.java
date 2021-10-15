package com.wenbo.str;

import java.util.Arrays;
import java.util.List;

/**
 * @author: liwenbo
 * @date: 2021-10-12 14:34:05
 * 
 * @desc: 
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "http://baidu.com,http://taobao.cn";
        String str2 = "http://wieuweu7.cn";
        String str3 = "";
        List<String> list1 = Arrays.asList(str1.split(","));
        List<String> list2 = Arrays.asList(str2.split(","));
        List<String> list3 = Arrays.asList(str3.split(","));
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list2);
        System.out.println(list3);

    }
}
