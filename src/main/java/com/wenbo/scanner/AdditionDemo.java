package com.wenbo.scanner;

import java.util.Scanner;
/**
 * @author: liwenbo
 * @date: 2021-09-21 15:30:48
 * 
 * @desc: 使用Scanner的加法Demo
 */
public class AdditionDemo {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }
}
