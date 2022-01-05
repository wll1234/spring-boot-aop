Run this :

```shell
curl localhost:8080/test
```

Result :

```
Controller begin
[Around] Begin : 1640088997233
[AfterReturning] arg = argument1 argument2 
[Before] kind = method-execution
[Before] target = com.example.aop.example.service.EventService@51403897
[Before] signature = String com.example.aop.example.service.EventService.test(String,String)
[Before] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@6a70bf76
Service begin (argument1, argument2)
Service end
[AfterReturning] arg = argument1 argument2 
[AfterReturning] kind = method-execution
[AfterReturning] target = com.example.aop.example.service.EventService@51403897
[AfterReturning] response = Service done
[AfterReturning] signature = String com.example.aop.example.service.EventService.test(String,String)
[AfterReturning] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@6a70bf76
[After] arg = argument1 argument2 
[After] kind = method-execution
[After] target = com.example.aop.example.service.EventService@51403897
[After] signature = String com.example.aop.example.service.EventService.test(String,String)
[After] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@6a70bf76
[Around] Runtime : 1057
Controller response = Service done
==========================================
[Around] Begin : 1640088998290
[AfterReturning] arg = 
[Before] kind = method-execution
[Before] target = com.example.aop.example.service.EventService@51403897
[Before] signature = void com.example.aop.example.service.EventService.exceptionTest()
[Before] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@1969a726
[AfterThrowing] arg = 
[AfterThrowing] kind = method-execution
[AfterThrowing] target = com.example.aop.example.service.EventService@51403897
[AfterThrowing] exception = Exception message
[AfterThrowing] signature = void com.example.aop.example.service.EventService.exceptionTest()
[AfterThrowing] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@1969a726
[After] arg = 
[After] kind = method-execution
[After] target = com.example.aop.example.service.EventService@51403897
[After] signature = void com.example.aop.example.service.EventService.exceptionTest()
[After] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@1969a726
Controller Exception! message = Exception message
Controller end
```