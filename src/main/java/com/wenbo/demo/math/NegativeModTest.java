package com.wenbo.demo.math;

/**
 * @author: liwenbo
 * @date: 2021-09-25 21:35:51
 * @desc: 负数取余测试
 * 【结论】
 * 负数取余：按正数规则取余，然后加上负号
 */
public class NegativeModTest {
    public static void main(String[] args) {
        mod(1, 3);
        mod(2, 3);
        mod(3, 3);
        mod(4, 3);
        mod(5, 3);
        mod(0, 3);
        mod(-1, 3);
        mod(-2, 3);
        mod(-3, 3);
        mod(-4, 3);
        mod(-5, 3);
    }

    private static void mod(int a, int b) {
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
