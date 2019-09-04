package com.hensu.javapractise.javadrill.jdk.modifier.p2;

import com.hensu.javapractise.javadrill.jdk.modifier.p1.A;

/**
 * @Author: sh
 * @Description: E
 * @Date: 10:49 2019/9/4
 */
public class E {

    public void ee(){
        A a = new A();
        //String aProtected = a.protected_;// 非子类不同包下不可访问
        //String aDefault = a.default_;// 不同包下不可访问，与是否子类无关
        String aPublic = a.public_;
    }
}
