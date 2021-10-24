package com.wenbo.bean;

/**
 * @author: liwenbo
 * @date: 2021-10-23 13:02:54
 * 
 * @desc: 对象默认值测试
 */
public class DefaultValueDemo {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getEmail());
    }
}
