package com.wenbo.demo;

/**
 * @author: liwenbo
 * @date: 2021-10-17 21:15:25
 * 
 * @desc: final 修饰的变量被赋值后，能否被修改
 */
public class FinalDemo {
    static final String STR = "STRING";
    public static void main(String[] args) {
        final int num;
        num = 1;
//        num = 2;
        System.out.println(num);
        System.out.println(STR);
    }
}
