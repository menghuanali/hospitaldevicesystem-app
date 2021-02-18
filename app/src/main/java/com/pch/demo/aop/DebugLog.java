package com.pch.demo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *    author : 潘成花
 *    
 *    time   : 2021/02/06
 *    desc   : Debug 日志注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface DebugLog {

    String value() default "DebugLog";
}