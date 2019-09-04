package com.hensu.javapractise.javadrill.jdk.modifier.p2;

import com.hensu.javapractise.javadrill.jdk.modifier.p1.A;

/**
 * @Author: sh
 * @Description: C
 * @Date: 10:39 2019/9/4
 */
public class C extends A {

    public void cc(){
        String aPublic_ = this.public_;// public
        //String aDefault = this.default_;// default 不同包下不能访问，与是否子类无关
        String aProtected = this.protected_;// protected;
        C c = new C();
        String cPro = c.protected_;
        String cp = c.public_;
    }
}
