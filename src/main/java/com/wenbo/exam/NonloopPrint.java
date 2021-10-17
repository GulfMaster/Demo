package com.wenbo.exam;

/**
 * @author: liwenbo
 * @date: 2021-10-17 15:59:07
 * 
 * @desc: 不使用循环打印 0 - 100
 */
public class NonloopPrint {
    public static void main(String[] args) {
        show(1);
    }

    private static int show(int num){
        if(num <= 100){
            System.out.println(num);
            return show(++num);
        }
        return num;
    }
}
