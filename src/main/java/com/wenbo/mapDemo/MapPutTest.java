package com.wenbo.mapDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liwenbo
 * @date: 2021-10-27 15:06:35
 * @desc: map 放重复 key 测试
 */
public class MapPutTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("num1",3);
        map.put("num2",9);
        map.put("num1",map.get("num1")+3);//6
        map.put("num2",map.get("num2")+12);//21
        System.out.println(map);
    }
}
