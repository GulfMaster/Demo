package com.wenbo;

import java.util.Scanner;

/**
 * @author: liwenbo
 * @date: 2021-09-21 15:17:58
 * 
 * @desc: 只是一个输入输出的Demo
 * 在机试的时候突然把Scanner给忘了，导致调试了好久的代码没办法正常执行
 */
public class ScannerDemo {
    public static void main(String[] args) {
        // 声明Scanner
        Scanner sc = new Scanner(System.in);
        while(true){
            // 获取输入
            String inputStr = sc.next();
            // 如果输入”break“跳出循环
            if("break".equals(inputStr)){
                break;
            }
            // 打印输入
            System.out.println(inputStr);
        }
    }
}
