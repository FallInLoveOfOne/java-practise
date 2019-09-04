package com.hensu.javapractise.javadrill.jdk.thread;

/**
 * 在同步机制中，通过对象的锁机制保证同一时间只有一个线程访问变量。这时该变量是多个线程共享的。
 * 而ThreadLocal则从另一个角度来解决多线程的并发访问。ThreadLocal会为每一个线程提供一个独立的变量副本，
 * 从而隔离了多个线程对数据的访问冲突
 * @Author: sh
 * @Description: ThreadLocalT
 * @Date: 9:33 2019/9/4
 */
public class ThreadLocalT {

    public static final String FL = "HAHA";

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    static {
        threadLocal.set("local val");
    }
}
