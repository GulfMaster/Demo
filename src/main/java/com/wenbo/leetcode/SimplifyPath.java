package com.wenbo.leetcode;

import java.util.LinkedList;

/**
 * @author: liwenbo
 * @date: 2021-09-27 11:46:13
 * @desc: 以 Unix 风格给出一个文件的绝对路径，你需要简化它。或者换句话说，将其转换为规范路径。
 * <p>
 * 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （…） 表示将目录切换到上一级（指向父目录）；
 * 两者都可以是复杂相对路径的组成部分。更多信息请参阅：Linux / Unix中的绝对路径 vs 相对路径
 * <p>
 * 请注意，返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。最后一个目录名（如果存在）
 * 不能以 / 结尾。此外，规范路径必须是表示绝对路径的最短字符串。
 */
public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/a/../../b/../c//.//"));
    }
    public static String simplifyPath(String path) {
        String[] pathArr = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for (String s : pathArr) {
            if ("..".equals(s)) {
                if (!stack.isEmpty()) stack.removeLast();
            } else if (".".equals(s) || "".equals(s)) {
            } else stack.addLast(s);
        }
        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append('/');
            sb.append(s);
        }
        return sb.toString();
    }

}
