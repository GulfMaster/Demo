package com.wenbo.bean;

/**
 * @author: liwenbo
 * @date: 2021-10-09 10:34:17
 * 
 * @desc: 默认值测试
 */
public class Person {
    String name;
    int age;
    boolean isMale;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.isMale);
    }
}
