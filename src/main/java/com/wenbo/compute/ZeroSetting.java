package com.wenbo.compute;

/**
 * @author: liwenbo
 * @date: 2021-09-16 14:58:57
 * 
 * @desc: 320312后两位置零
 */
public class ZeroSetting {
    public static void main(String[] args) {
        int num1 = 320312;
        int num2 = 320010;
        int num3 = 1320010;

        int remainder = 100;
        System.out.println(num1-num1%remainder);
        System.out.println(num2-num2%remainder);
        System.out.println(num3-num3%remainder);
    }
}
