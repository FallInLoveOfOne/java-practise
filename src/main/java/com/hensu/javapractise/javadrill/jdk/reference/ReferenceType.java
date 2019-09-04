package com.hensu.javapractise.javadrill.jdk.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/**
 * 最佳参考：https://blog.csdn.net/rodbate/article/details/72857447
 * 强引用：形如Object obj = new Object();
 * 软引用：特点在内存不足的时，GC垃圾回收时候会回收该对象
 * 软引用：每次G执行垃圾回收，都会回收该对象
 * 虚引用：
 * 引用队列：
 * @Author: sh
 * @Description: ReferenceType
 * @Date: 13:52 2019/9/4
 */
public class ReferenceType {
    public static void main(String[] args) {
        Map<String,Object> object = new HashMap<>();// 强引用
        object.put("k","val");
        object=null;
        SoftReference<Map<String,Object>> softReference = new SoftReference(object);// 软引用
        System.out.println(softReference.get().get("k"));
        WeakReference<Map<String,Object>> weakReference = new WeakReference(object);// 弱引用
        System.out.println(weakReference.get().get("k"));
        ReferenceQueue<Map<String,Object>> referenceQueue = new ReferenceQueue<>();// 软弱回收后放入回收的对象，虚引用，回收前放入回收的对象
        PhantomReference<Map<String,Object>> phantomReference = new PhantomReference(object,referenceQueue);// 虚引用，需要指定引用队列
    }
}
