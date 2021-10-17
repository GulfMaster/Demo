package com.wenbo.abstractDemo;

/**
 * @author: liwenbo
 * @date: 2021-10-17 22:47:18
 * 
 * @desc: Demo
 */
public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        AbastractAnimal abastractAnimal = new Dog();
        dog.eat();
        abastractAnimal.eat();
    }
}
