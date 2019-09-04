package com.hensu.javapractise.javadrill.jdk.modifier.p1;

/**
 * @Author: sh
 * @Description: D
 * @Date: 10:47 2019/9/4
 */
public class D {

    public void dd(){
        A a = new A();
        String aProtected = a.protected_;
        String aDefault = a.default_;// 同一包下可访问，与是否子类无关
        String aPublic = a.public_;
    }
}
