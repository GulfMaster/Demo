package com.wenbo.demo;

import java.util.HashMap;

/**
 * @author: liwenbo
 * @date: 2021-09-24 19:04:33
 * @desc: HashMapDemo
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("name","张三");
        map.put("name","李四");
        map.put("name","王五");
        map.put("sex","男");
        System.out.println(map.get("name"));
    }

    class HashDemo {
        private Entry[] innerEntry;
        private int capacity;

        public HashDemo() {
            this.capacity = 16;
            this.innerEntry = new Entry[capacity];
        }

        public HashDemo(int capacity) {
            this.capacity = capacity;
            this.innerEntry = new Entry[capacity];
        }

        /**
         * 放入元素
         *
         * @param key
         * @param obj
         */
        public void set(String key, Object obj) {
            int index = key.hashCode() % capacity;
            // 如果这个位置没有数据，则将新数据放入
            if (innerEntry[index] == null) {
                Entry entry = new Entry(key, obj);
                innerEntry[index] = entry;
                return;
            }
            // 如果这个位置有数据，则找新的位置

        }

        /**
         * 根据key获取元素
         *
         * @param key
         * @return
         */
        public Object get(String key) {
            int index = key.hashCode() % capacity;
            // 如果位置上有数据，直接返回
            if (innerEntry[index] != null) {
                return innerEntry[index].value;
            }
            Object value = new Object();
            for (int i = index; i < capacity; i++) {
                Entry entry = innerEntry[i];
                if(key.equals(entry.key)){
                    value = entry.value;
                    break;
                }
            }
            return value;
        }

        /**
         * 返回容量
         *
         * @return
         */
        public int getSize() {
            return this.capacity;
        }
    }


    class Entry {
        private String key;
        private Object value;

        public Entry() {
        }

        public Entry(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
}
