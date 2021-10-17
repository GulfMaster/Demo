package com.wenbo.abstractDemo;

/**
 * @author: liwenbo
 * @date: 2021-10-17 22:46:51
 * 
 * @desc: 子类必须实现父类的抽象方法
 */
public class Dog extends AbastractAnimal{
    @Override
    public void eat() {
        System.out.println("dog eat bone");
    }
}
