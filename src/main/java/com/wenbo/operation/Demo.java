package com.wenbo.operation;

/**
 * @author: liwenbo
 * @date: 2021-11-15 14:31:54
 * @desc: 
 */
public class Demo {
    public static void main(String[] args) {
        boolean bol = false;
        boolean[] arr = new boolean[]{false,true,false,false,true};
        for (boolean b : arr) {
            bol |= b;
        }
        System.out.println(bol);
    }
}
