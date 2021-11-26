package com.wenbo.demo.scanner;

import java.util.Scanner;
/**
 * @author: liwenbo
 * @date: 2021-09-21 16:15:09
 * 
 * @desc:
 * System.in“标准”输入流。此流已打开并准备提供输入数据。通常，此流对应于键盘输入或者由主机环境或用户指定的另一个输入源。
 *
 * 当调用close()后，System.in这个流将会关闭，所以也就影响到了第二个scanner了，导致不能接受数据，从而引发java.util.NoSuchElementException，
 * 而且将Scanner sc2 = new Scanner(System.in);sc1.close();后面依旧是这个错误，说明流关闭后就无法重新打开了。
 */
public class NoSuchElementExceptionDemo {
    public static void main(String[] args) {
        // 声明两个Scanner对象
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        // 获取input1中的数据
        int number1 = sc1.nextInt();
        int number2 = sc1.nextInt();
        // 关闭input1
        sc1.close();
        // 此时会抛出NoSuchElementException异常
        double number3 = sc2.nextDouble();
        double number4 = sc2.nextDouble();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
    }
}
