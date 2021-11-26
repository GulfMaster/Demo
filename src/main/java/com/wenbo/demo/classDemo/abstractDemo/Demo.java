package com.wenbo.demo.classDemo.abstractDemo;

/**
 * @author: liwenbo
 * @date: 2021-10-17 22:47:18
 * 
 * @desc: Demo
 * 抽象类和接口一样，不能实例化
 */
public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        AbstractAnimal abstractAnimal = new Dog();
        dog.eat();
        abstractAnimal.eat();
    }
}
