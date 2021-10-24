package com.wenbo.aop;

import org.springframework.stereotype.Component;

/**
 * @author: liwenbo
 * @date: 2021-10-23 14:06:15
 * 
 * @desc: 
 * 被代理对象
 */
@Component
public class TargetClass {
    /**
     * 拼接两个字符串
     */
    public String jointMethod(String str1, String str2) {
        return str1 + "+" + str2;
    }
}