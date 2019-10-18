package com.hensu.javapractise.javadrill.jdk.map;

import java.util.*;

/**
 * @Author: sh
 * @Description: TMap
 * 很多时候，我们用jdbctemplate或mybatis的时候，为了查询通用，会选择使用map数据结构，因为hashmap本身无序，所以为了保证key的有序性，会采用linkedhashmap
 * 从上可知，LinkedHashMap是可以完全代替HashMap的，不用担心性能问题。
 * @Date: 11:01 2019/10/18
 */
public class TMap {

    public static void main(String[] args) {
        efficiencyMap();
        readEffiMap();
    }

    public static void efficiencyMap() {
        Integer count = 1000000;
        Random random = new Random();
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < count; i++) {
            map.put(i + "", i + "");
        }
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            map.get((random.nextInt(count) + 1) + "");
        }
        long time2 = System.currentTimeMillis();
        System.out.println("HashMap time:" + (time2 - time1));
        ////////////////////////////////////////////////////////////////////////
        Map<String, String> linkedMap = new LinkedHashMap<String, String>();
        for (int i = 0; i < count; i++) {
            linkedMap.put(i + "", i + "");
        }

        time1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linkedMap.get((random.nextInt(count) + 1) + "");
        }
        time2 = System.currentTimeMillis();
        System.out.println("LinkedHashMap time:" + (time2 - time1));
        ////////////////////////////////////////////////////////////////////////
        Map<String, String> treeMap = new TreeMap<String, String>();
        for (int i = 0; i < count; i++) {
            treeMap.put(i + "", i + "");
        }

        time1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            treeMap.get((random.nextInt(count) + 1) + "");
        }
        time2 = System.currentTimeMillis();
        System.out.println("TreeMap time:" + (time2 - time1));
    }

    public static void readEffiMap() {
        Integer count = 1000000;
        Random random = new Random();
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < count; i++) {
            map.put(i + "", i + "");
        }
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            map.get(i + "");
        }
        long time2 = System.currentTimeMillis();
        System.out.println("HashMap time:" + (time2 - time1));
        ////////////////////////////////////////////////////////////////////////
        Map<String, String> linkedMap = new LinkedHashMap<String, String>();
        for (int i = 0; i < count; i++) {
            linkedMap.put(i + "", i + "");
        }

        time1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linkedMap.get(i + "");
        }
        time2 = System.currentTimeMillis();
        System.out.println("LinkedHashMap time:" + (time2 - time1));
        ////////////////////////////////////////////////////////////////////////
        Map<String, String> treeMap = new TreeMap<String, String>();
        for (int i = 0; i < count; i++) {
            treeMap.put(i + "", i + "");
        }

        time1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            treeMap.get(i + "");
        }
        time2 = System.currentTimeMillis();
        System.out.println("TreeMap time:" + (time2 - time1));
    }
}
