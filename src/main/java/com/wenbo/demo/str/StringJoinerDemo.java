package com.wenbo.demo.str;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author: liwenbo
 * @date: 2021-11-11 10:02:43
 * @desc: StringJoinerDemo
 */
public class StringJoinerDemo {
    public static void main(String[] args) {
        String a = "w", b = "d", c = "n", d = "m", e = "d";
        List<String> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(null);
        list.add(e);


        // 声明StringJoiner, 每个元素通过 "." 分割
        StringJoiner joiner = new StringJoiner(".");
        list.forEach(joiner::add);
        System.err.println(joiner.toString());


        // 每个元素通过 "." 分割，并且用 "[" 和 "]" 包住前后
        StringJoiner joiner2 = new StringJoiner(".", "[", "]");
        list.forEach(joiner2::add);
        System.err.println(joiner2.toString());


        StringJoiner joiner3 = new StringJoiner(".");
        list.forEach(joiner3::add);
//        System.err.println(joiner3.toString());
        joiner3.setEmptyValue("abc");
        System.err.println(joiner3.toString());




    }
}
