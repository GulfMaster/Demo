package com.wenbo.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: liwenbo
 * @date: 2021-09-28 17:25:38
 * 
 * @desc:
 * 小华是个很有对数字很敏感的小朋友，他觉得数字的不同排列方式有特殊美
 * 感。天，小华突发奇想，如果数字多行排列，第一行1个数，第二行2个，第
 * 三行3个，即第n行有n个数字，并且奇数行正序排列，偶数行逆序排列，数字依
 * 次累加。这样排列的数字一定很有 意思。聪明的你能编写代码帮助小华完成这
 * 个想法吗?
 * 规则总结如下:
 * a、每个数字占据4个位置，不足四位用**补位，如1打印为1**
 * **。
 * b、数字之间相邻4空格。
 * C、数字的打印顺序按照正序逆序交替打印，奇数行正序，偶数行逆序。
 * d、后一行数字顶格，第n-1行相对第n行缩进四个空格
 */
public class Qeustion22 {
    private static final String FOUR_SPACE = "    ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int num = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int spaceNum = 0; spaceNum < row-i-1; spaceNum++) {
                // 添加开始的空格
                sb.append(FOUR_SPACE);
            }
            List<String> list = new ArrayList<>();
            for (int numStr = 0; numStr <= i; numStr++) {
                if(numStr!=0){
                    list.add(FOUR_SPACE);
                }
                list.add(fillAsterisk(num));
                num++;
            }
            sb.append(turnoverList(list,i+1));
            sb.append("\r\n");
        }
        System.out.println(sb.toString());
    }
    private static String turnoverList(List<String> list,int rowNum){
        StringBuilder sb = new StringBuilder();
        if(rowNum%2==1){
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
        }else {
            for (int i = list.size()-1; i >=0 ; i--) {
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }

    /**
     * 填充*
     */
    private static String fillAsterisk(int num){
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        if(num<10){
            sb.append("***");
        }else if(num<100){
            sb.append("**");
        }else if(num<1000){
            sb.append("*");
        }
        return sb.toString();
    }
}
