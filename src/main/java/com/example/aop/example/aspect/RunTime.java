package com.example.aop.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class RunTime {

    @Around("@annotation(com.example.aop.example.annotation.CheckTime)")
    public Object aroundCheckTime(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        System.out.println("[Around] Begin : " + (begin));
        Object obj = pjp.proceed();
        System.out.println("[Around] Runtime : " + (System.currentTimeMillis() - begin));
        return obj;
    }

    @Before("@annotation(com.example.aop.example.annotation.CheckTime)")
    public void beforeCheckTime(JoinPoint jp) throws Throwable {
        System.out.print("[AfterReturning] arg = ");
        Arrays.stream(jp.getArgs()).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("[Before] kind = " + jp.getKind());
        System.out.println("[Before] target = " + jp.getTarget());
        System.out.println("[Before] signature = " + jp.getSignature());
        System.out.println("[Before] sourceLocation = " + jp.getSourceLocation());
    }

    @AfterReturning(value = "@annotation(com.example.aop.example.annotation.CheckTime)", returning = "response")
    public void afterReturningCheckTime(JoinPoint jp, String response) throws Throwable {
        System.out.print("[AfterReturning] arg = ");
        Arrays.stream(jp.getArgs()).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("[AfterReturning] kind = " + jp.getKind());
        System.out.println("[AfterReturning] target = " + jp.getTarget());
        System.out.println("[AfterReturning] response = " + response);
        System.out.println("[AfterReturning] signature = " + jp.getSignature());
        System.out.println("[AfterReturning] sourceLocation = " + jp.getSourceLocation());
    }

    @After(value = "@annotation(com.example.aop.example.annotation.CheckTime)")
    public void afterCheckTime(JoinPoint jp) throws Throwable {
        System.out.print("[After] arg = ");
        Arrays.stream(jp.getArgs()).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("[After] kind = " + jp.getKind());
        System.out.println("[After] target = " + jp.getTarget());
        System.out.println("[After] signature = " + jp.getSignature());
        System.out.println("[After] sourceLocation = " + jp.getSourceLocation());
    }
}
