package com.hensu.javapractise.javadrill.jdk.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: sh
 * @Description: MyProxy
 * @Date: 15:24 2019/9/4
 */
public class MyProxy {
    public interface IHello{
        void sayHello();
    }

    static class Hello implements IHello{
        @Override
        public void sayHello() {
            System.out.println("I am target");
        }
    }

    static class MyInvocatinHandle implements InvocationHandler{
        private Object tar;
        public MyInvocatinHandle(Object tar){
            this.tar=tar;
        }

        /**
         * proxy为JVM动态生成的代理对象
         * @param proxy
         * @param method
         * @param args
         * @return
         * @throws Throwable
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName()+"-------------------before");
            Object result = method.invoke(tar,args);
            System.out.println(method.getName()+"-------------------after");
            return result;
        }
    }

    public static void geneProxy(){
        Hello tar = new Hello();
        MyInvocatinHandle myInvocatinHandle = new MyInvocatinHandle(tar);
        try {
            Class proxyClass = Proxy.getProxyClass(IHello.class.getClassLoader(),IHello.class);
            Constructor constructor = proxyClass.getConstructor(InvocationHandler.class);
            IHello proxyObj = (IHello) constructor.newInstance(myInvocatinHandle);
            proxyObj.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }

        IHello hh = (IHello)Proxy.newProxyInstance(IHello.class.getClassLoader(),new Class[]{IHello.class},myInvocatinHandle);
        hh.sayHello();
    }

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        geneProxy();
    }
}
