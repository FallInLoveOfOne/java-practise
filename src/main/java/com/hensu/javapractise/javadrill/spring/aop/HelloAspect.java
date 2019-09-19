package com.hensu.javapractise.javadrill.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author: sh
 * @Description: HelloAspect
 * @Date: 10:27 2019/9/12
 */
@Aspect
public class HelloAspect {

    @Pointcut("execution(public * com.hensu.javapractise.controller.*.*(..)) && @annotation(com.hensu.javapractise.javadrill.jdk.annotation.MyAnno)")
    public void advice() {
    }

    ;
}
