package com.wenbo.demo.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liwenbo
 * @date: 2021-11-11 16:11:19
 * @desc: list 删除 demo
 */
public class ListRemoveDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("删除前: "+list);
        list.remove(1);
        System.out.println("删除后: "+list);
    }
}
