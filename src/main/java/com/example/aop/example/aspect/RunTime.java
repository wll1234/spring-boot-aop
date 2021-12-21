package com.example.aop.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RunTime {

    @Around("@annotation(com.example.aop.example.annotation.CheckTime)")
    public Object checkTime(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object obj = pjp.proceed();
        System.out.println("Runtime : "+(System.currentTimeMillis() - begin));
        return obj;
    }
}
