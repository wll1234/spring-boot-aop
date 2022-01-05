package com.example.aop.example.aspect;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RunTimeAspect {

    @Around("@annotation(com.example.aop.example.annotation.Benchmark)")
    public Object aroundBenchmark(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        System.out.println("[Around]");
        System.out.println("  toString = "+pjp);
        System.out.println("  arg = ");
        Arrays.stream(pjp.getArgs()).forEach(x -> System.out.println("    "+x));
        Object obj = pjp.proceed();
        System.out.println("[Around]");
        System.out.println("  toString = "+pjp);
        System.out.println("  Response : " + obj);
        System.out.println("  Runtime : " + (System.currentTimeMillis() - begin));
        return obj;
    }

    @Before("@annotation(com.example.aop.example.annotation.Benchmark)")
    public void beforeBenchmark(JoinPoint jp) {
        System.out.println("[Before]");
        System.out.println("  arg = ");
        Arrays.stream(jp.getArgs()).forEach(x -> System.out.println("    "+x));
        System.out.println("  toString = " + jp);
    }

    @AfterReturning(value = "@annotation(com.example.aop.example.annotation.Benchmark)", returning = "response")
    public void afterReturningBenchmark(JoinPoint jp, String response) {
        System.out.println("[AfterReturning]");
        System.out.println("  arg = ");
        Arrays.stream(jp.getArgs()).forEach(x -> System.out.println("    "+x));
        System.out.println("  toString = " + jp);
        System.out.println("  response = " + response);
    }

    @After(value = "@annotation(com.example.aop.example.annotation.Benchmark)")
    public void afterBenchmark(JoinPoint jp) {
        System.out.println("[After]");
        System.out.println("  arg = ");
        Arrays.stream(jp.getArgs()).forEach(x -> System.out.println("    "+x));
        System.out.println("  toString = " + jp);
    }

    @AfterThrowing(value = "@annotation(com.example.aop.example.annotation.Benchmark)", throwing = "e")
    public void afterThrowingBenchmark(JoinPoint jp, Exception e) {
        System.out.println("[AfterThrowing]");
        System.out.println("  toString = "+jp);
        System.out.println("  arg = ");
        Arrays.stream(jp.getArgs()).forEach(x -> System.out.println("   "+x));
        System.out.println("  exception = " + e.getMessage());
    }

    @Around("execution(* com.example.aop.example.controller..*(..)) || execution(* com.example.aop.example.service..*(..))")
    public Object aroundPackage(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        System.out.println("[Around-Package]");
        System.out.println("  toString = "+pjp);
        System.out.println("  arg = ");
        Arrays.stream(pjp.getArgs()).forEach(x -> System.out.println("   "+x));
        Object obj = pjp.proceed();
        System.out.println("[Around-Package]");
        System.out.println("  toString = "+pjp);
        System.out.println("  Response : " + obj);
        System.out.println("  Runtime : " + (System.currentTimeMillis() - begin));
        return obj;
    }
}
