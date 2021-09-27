package com.wenbo.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author: liwenbo
 * @date: 2021-09-27 10:34:12
 * 
 * @desc: 把输入字符串转换成整数数组,降序排序后输出。
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] intStr = str.split("\\s");
        List<Integer> list = new ArrayList<>();
        for (String s : intStr) {
            list.add(Integer.parseInt(s));
        }
        // 排序
        List orderedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list.size());
        System.out.println(list);
        for (int i = 0; i < orderedList.size(); i++) {
            System.out.print(orderedList.get(i));
            if(i< orderedList.size()-1){
                System.out.print(" ");
            }
        }
    }
}
