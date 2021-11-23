package com.wenbo.str;

/**
 * @author: liwenbo
 * @date: 2021-11-23 16:05:55
 * @desc: 
 */
public class TrimDemo {
    public static void main(String[] args) {
//        String str1 = null;
        String str2 = "";
        String str3 = "\t1231";
        String str4 = "\r1231\r";
        String str5 = "\n12\r3\n1";
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println("========================");
//        System.out.println(str1.trim());
        System.out.println(str2.trim());
        System.out.println(str3.trim());
        System.out.println(str4.trim());
        System.out.println(str5.trim());
        System.out.println("=========================");
        System.out.println(str5.trim());

    }
}
