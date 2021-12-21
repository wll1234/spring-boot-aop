Run this :

```shell
curl localhost:8080/test
```

Result :

```
Controller begin
[Around] Begin : 1640088351640
[AfterReturning] arg = argument1 argument2 
[Before] kind = method-execution
[Before] target = com.example.aop.example.service.EventServiceImpl@f677351
[Before] signature = String com.example.aop.example.service.EventServiceImpl.test(String,String)
[Before] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@45e81a5d
Service begin (argument1, argument2)
Service end
[AfterReturning] arg = argument1 argument2 
[AfterReturning] kind = method-execution
[AfterReturning] target = com.example.aop.example.service.EventServiceImpl@f677351
[AfterReturning] response = Service done
[AfterReturning] signature = String com.example.aop.example.service.EventServiceImpl.test(String,String)
[AfterReturning] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@45e81a5d
[After] arg = argument1 argument2 
[After] kind = method-execution
[After] target = com.example.aop.example.service.EventServiceImpl@f677351
[After] signature = String com.example.aop.example.service.EventServiceImpl.test(String,String)
[After] sourceLocation = org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@45e81a5d
[Around] Runtime : 1082
Controller end. response = Service done

```