package com.wenbo.mapDemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: liwenbo
 * @date: 2021-11-25 14:29:24
 * @desc:
 * 对使用流对 Map 进行排序
 * <a>https://juejin.cn/post/6844903985808146439<a/>
 */
public class SortDemo {
    public static void main(String[] args) {
        // 创建一个Map，并填入数据
        Map<String, Integer> codes = new HashMap<>();
        codes.put("United States", 1);
        codes.put("Germany", 49);
        codes.put("France", 33);
        codes.put("China", 86);
        codes.put("Pakistan", 92);

// 按照Map的键进行排序
        Map<String, Integer> sortedMap = codes.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldVal, newVal) -> oldVal,
                                LinkedHashMap::new
                        )
                );
//        sortedMap.entrySet().forEach(System.out::println);

        Map<String, Integer> sortedMap2 = codes.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new));
        sortedMap2.entrySet().forEach(System.out::println);

    }
}
