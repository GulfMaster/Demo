package com.wenbo.mapDemo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: liwenbo
 * @date: 2021-10-30 12:41:27
 * 
 * @desc: 将 Map 的 value 转换为 List
 */
public class MapValueToList {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("1",5);
        map.put("2",1);
        map.put("3",2);
        map.put("4",3);
        map.put("5",1);
        map.put("6",1);
        System.out.println(map);
        List<Integer> list = new ArrayList<>(map.values()) ;
        System.out.println(list);
    }
}
