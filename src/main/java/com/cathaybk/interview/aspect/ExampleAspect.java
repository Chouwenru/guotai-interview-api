package com.cathaybk.interview.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
@Order(1) // 確保此切面在其他切面之前執行
public class ExampleAspect {


    // 定義切點：匹配 com.cathaybk.interview.service 包下所有方法
    @Pointcut("execution(* com.cathaybk.interview.service..*(..))")
    public void serviceMethods() {}
    
    // 定義切點：匹配 com.cathaybk.interview.controller 包下所有方法
    @Pointcut("execution(* com.cathaybk.interview.controller..*(..))")
    public void controllerMethods() {}

    @Before("serviceMethods()")
    public void beforeAdvice() {
        log.info("方法執行");
    }

    @After("serviceMethods()")
    public void afterAdvice() {
        log.info("方法結束");
    }

    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void afterReturningAdvice(Object result) {
        log.info("返回值: " + result);
    }

    @AfterThrowing(pointcut = "serviceMethods()", throwing = "ex")
    public void afterThrowingAdvice(Exception ex) {
        log.info("Exception: " + ex.getMessage());
    }

    @Around("serviceMethods()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("方法執行前");
        Object result = joinPoint.proceed();
        log.info("方法執行結束");
        return result;
    }
}
