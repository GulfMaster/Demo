package com.wenbo.demo.process;

/**
 * @author: liwenbo
 * @date: 2021-11-08 20:21:38
 * 
 * @desc: try catch demo
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println(divisionCatch(1,0));
        System.out.println(divisionCatch(6,2));
    }
    private static int divisionCatch(int a,int b){
        int result = -1;
        try{
            result = a/b;
            return result;
        }catch (Exception e){
            return -2;
        }
//        return result;
    }
}
