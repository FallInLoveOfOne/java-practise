package com.hensu.javapractise.javadrill.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: sh
 * @Description: FX
 * @Date: 16:23 2019/9/2
 */
public class FX {

    public static void tt(){
        List<String> list = new ArrayList<>();
        list.add("he");
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        System.out.println("List:"+(list.getClass()==list2.getClass()));// true
        System.out.println("List:"+(list.equals(list2)));// false
        System.out.println("instanceof:"+(list instanceof List));// true
        Integer t1 = new Integer(1);
        Integer t2 = new Integer(2);
        System.out.println(t1.getClass()==t2.getClass());// true
    }

    public static void main(String[] args) {
        tt();
    }
}
