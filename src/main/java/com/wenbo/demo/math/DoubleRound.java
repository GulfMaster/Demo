package com.wenbo.demo.math;

import java.math.BigDecimal;

/**
 * @author: liwenbo
 * @date: 2021-10-29 11:56:37
 * @desc: double 类型保留两位小数
 */
public class DoubleRound {
    public static void main(String[] args) {
        System.out.println(new BigDecimal(0.114111111).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        System.out.println(new BigDecimal(123146.995111111).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        System.out.println(new BigDecimal(0.195111111).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        System.out.println(new BigDecimal(123.555111111).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }
}
