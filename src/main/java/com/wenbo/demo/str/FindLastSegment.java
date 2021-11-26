package com.wenbo.demo.str;

/**
 * @author: liwenbo
 * @date: 2021-10-20 10:31:28
 * @desc: 查找元素最后一个分隔符后的数据
 */
public class FindLastSegment {
    public static void main(String[] args) {
        System.out.println(findLastSegment("ABC_DDDD_3541"));
        System.out.println(findLastSegment("ABC_DEFG_41"));
        System.out.println(findLastSegment("ABC_D___123"));
        System.out.println(findLastSegment("ABCDDDD_1"));
        System.out.println(findLastSegment("ABCEDDFAFAS1"));
    }

    private static String findLastSegment(String str) {
        int index = str.lastIndexOf('_');
        System.out.println("_位置"+index);
        return index > 0 ? str.substring(index+1) : str;
    }
}
