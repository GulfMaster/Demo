package com.wenbo.exam;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: liwenbo
 * @date: 2021-09-27 11:02:22
 * 
 * @desc: 文件全路径格式转换
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArr = str.split("/");
        // 获取所有的目录信息
        List list = Arrays.asList(strArr).stream().filter(i->!i.isEmpty()).collect(Collectors.toList());
        for (int i = list.size()-1; i >0 ; i--) {
            // 如果 '.'删除自身
            if(".".equals(list.get(i))){
                list.remove(i);
            }else if("..".equals(list.get(i))){
                // 如果 '..'删除自身和前一个元素
                list.remove(i);
                list.remove(--i);
            }
        }
        System.out.print("/");
        for (int i = 0; i < list.size(); i++) {
            if(i>0){
                System.out.print("/");
            }
            System.out.print( list.get(i));
        }
    }
}
