package com.wenbo.basicDataType;

/**
 * @author: liwenbo
 * @date: 2021-10-17 22:08:10
 * 
 * @desc: 类型提升
 */
public class TypePromotion {
    public static void main(String[] args) {
        long count = 100000000;
//        int count = 100000000;
        int price = 1999;
        long totalPrice = price * count;
        System.out.println(totalPrice);
    }
}
