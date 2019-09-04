package com.hensu.javapractise.javadrill.jdk.thread;

import com.alibaba.dubbo.common.utils.ConcurrentHashSet;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 在同步机制中，通过对象的锁机制保证同一时间只有一个线程访问变量。这时该变量是多个线程共享的。
 * 而ThreadLocal则从另一个角度来解决多线程的并发访问。ThreadLocal会为每一个线程提供一个独立的变量副本，
 * 从而隔离了多个线程对数据的访问冲突
 *
 * 为每个线程创建一个ThreadLocalMap实例,K为ThreadLocal实例,V为ThreadLocal实例包裹的对象值
 * ThreadLocalMap是ThreadLocal的一个静态内部类，每个Thread都有一个ThreadLocalMap属性
 * @Author: sh
 * @Description: ThreadLocalT
 * @Date: 9:33 2019/9/4
 */
public class ThreadLocalT {

    /*public static final String FL = "HAHA";

    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
        @Override
        protected String initialValue(){
            return "init val";
        }
    };
    static {
        //threadLocal.set("local val");
    }

    public static void main(String[] args) {
        ThreadLocalT threadLocalT = new ThreadLocalT();
        System.out.println(threadLocalT.threadLocal.get() instanceof String);
        System.out.println(threadLocalT.threadLocal.get());//
        System.out.println(threadLocalT.threadLocal.get().equals("init val"));// true
    }*/

    static volatile AtomicInteger n = new AtomicInteger(-1);

    static ThreadLocal<DateFormat> sdf;//

    static {
        sdf = new ThreadLocal<DateFormat>() {
            @Override
            protected DateFormat initialValue() {
                return new SimpleDateFormat("yyyy-MM-dd");
            }
        };
    }

    public static void main(String[] args) throws ParseException, InterruptedException {

        Set<String> dateSet = new ConcurrentHashSet<>();
        Set<Integer> numberSet = new ConcurrentHashSet<>();

        Date[] dates = new Date[10];
        for (int i = 0; i < 10; i++) {
            dates[i] = sdf.get().parse(i + 10 + "-11-22");
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    int number = n.incrementAndGet();
                    String date = sdf.get().format(dates[number]);
                    numberSet.add(number);
                    dateSet.add(date);
                    System.out.println(number + " " + date);
                }
            });
        }
        executorService.shutdown();
        Thread.sleep(5000);
        System.out.println(dateSet.size());
        System.out.println(numberSet.size());
    }
}
