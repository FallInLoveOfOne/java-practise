package com.hensu.javapractise.javadrill.jdk.annotation;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

/**
 * @Author: sh
 * @Description: UseAnno
 * @Date: 14:16 2019/9/9
 */
@Slf4j
public class UseAnno {
    @MyAnno()
    private String userName;

    public static void main(String[] args) {
        UseAnno useAnno = new UseAnno();
        Field[] fields = useAnno.getClass().getDeclaredFields();
        for (Field field : fields){
            if(field.isAnnotationPresent(MyAnno.class)){
                MyAnno myAnno = field.getAnnotation(MyAnno.class);
                log.info(field.getName());
                log.info(myAnno.name());
                log.info(myAnno.flag()+"");
            }
        }
    }
}
