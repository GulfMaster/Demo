package com.wenbo.basicDataType;

/**
 * @author: liwenbo
 * @date: 2021-09-23 10:58:10
 * 
 * @desc: 包装类null调用toSting方法测试
 */
public class WrapperClassNullValueToStringTest {
    public static void main(String[] args) {
        Long num = new Long(null);
        System.out.println(num.toString());
    }
}
