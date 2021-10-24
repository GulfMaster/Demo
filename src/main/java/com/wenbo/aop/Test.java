package com.wenbo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: liwenbo
 * @date: 2021-10-23 14:06:39
 * 
 * @desc: AOP Demo
 */
public class Test {
    public static void main(String[] args) {
        //1、创建Spring的IOC的容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:bean.xml");

        //2、从IOC容器中获取bean的实例
        TargetClass targetClass = (TargetClass) ctx.getBean("targetClass");

        //3、使用bean
        String result = targetClass.jointMethod("spring","aop");
        System.out.println("result:" + result);
    }
}