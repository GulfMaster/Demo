package com.wenbo.demo.math.basicDataType;

/**
 * @author: liwenbo
 * @date: 2021-09-13 17:22:41
 * 
 * @desc: 基本数据类型强制转换demo
 */
public class TypeCastDemo {
    public static void main(String[] args) {
        int a1 =129;//1000,0001
        byte a2 = (byte) a1;
        System.out.println(a2);// -127

        int b1 = 257;// 1,0000,0001
        byte b2 = (byte) b1;
        System.out.println(b2);// 1

        int c =10;
        byte d = (byte) c;
        System.out.println(d);
    }
}
