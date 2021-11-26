package com.wenbo.demo.str;

/**
 * @author: liwenbo
 * @date: 2021-11-01 17:03:32
 * @desc:
 * 通过 = 创建字符串会在常量池中创建
 * 通过 new 方式会在堆中创建要给新的对象
 */
public class EqualsDemo {
    public static void main(String[] args) {
        String str1 = "白日依山尽";
        String str2 = "白日依山尽";
        String str3 = new String("白日依山尽");
        String str4 = new String("白日依山尽");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
    }
}
