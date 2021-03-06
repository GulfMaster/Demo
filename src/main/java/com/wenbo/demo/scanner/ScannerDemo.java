package com.wenbo.demo.scanner;

import java.util.Scanner;

/**
 * @author: liwenbo
 * @date: 2021-09-21 15:17:58
 * @desc: 在机试的时候突然把Scanner给忘了，导致调试了好久的代码没办法正常执行,遂仔细学习Scanner的使用
 * <p>
 * next() 与 nextLine() 区别
 * next():
 * 1、一定要读取到有效字符后才可以结束输入。
 * 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
 * 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
 * next() 不能得到带有空格的字符串。
 * <p>
 * nextLine()：
 * 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
 * 2、可以获得空白。
 */
public class ScannerDemo {
    public static void main(String[] args) {
        testNext();
//        testNextLine();
    }

    /**
     * 测试Scanner.next()
     */
    private static void testNext() {
        Scanner sc = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收:");
        // 判断是否还有输入
        if (sc.hasNext()) {
            String str1 = sc.next();
            System.out.println("输入的数据为:" + str1);
        }
        sc.close();
    }

    /**
     * 测试Scanner.nextLine()
     */
    private static void testNextLine() {
        Scanner sc = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收:");
        // 判断是否还有输入
        if (sc.hasNextLine()) {
            String str2 = sc.nextLine();
            System.out.println("输入的数据为:" + str2);
        }
        sc.close();
    }
}
