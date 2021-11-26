package com.wenbo.demo.str;

/**
 * @author: liwenbo
 * @date: 2021-10-27 09:30:18
 * @desc: split 方法测试
 */
public class SplitTest {
    public static void main(String[] args) {
        String str1 = "adfadsf1231231safdsafdsa1231231sadfs1ad";
        String[] strArr = str1.split("\\d+");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
