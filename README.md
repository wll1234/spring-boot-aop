Run this :

```shell
curl localhost:8080/test
```

Result :

```
[Around]
  toString = execution(String com.example.aop.example.controller.EventController.test())
  arg = 
[Around-Package]
  toString = execution(String com.example.aop.example.controller.EventController.test())
  arg = 
[Before]
  arg = 
  toString = execution(String com.example.aop.example.controller.EventController.test())
Controller begin
[Around]
  toString = execution(String com.example.aop.example.service.EventService.test(String,String))
  arg = 
    argument1
    argument2
[Around-Package]
  toString = execution(String com.example.aop.example.service.EventService.test(String,String))
  arg = 
   argument1
   argument2
[Before]
  arg = 
    argument1
    argument2
  toString = execution(String com.example.aop.example.service.EventService.test(String,String))
Service begin (argument1, argument2)
Service end
[AfterReturning]
  arg = 
    argument1
    argument2
  toString = execution(String com.example.aop.example.service.EventService.test(String,String))
  response = Service done
[After]
  arg = 
    argument1
    argument2
  toString = execution(String com.example.aop.example.service.EventService.test(String,String))
[Around-Package]
  toString = execution(String com.example.aop.example.service.EventService.test(String,String))
  Response : Service done
  Runtime : 1029
[Around]
  toString = execution(String com.example.aop.example.service.EventService.test(String,String))
  Response : Service done
  Runtime : 1029
Controller response = Service done
==========================================
[Around]
  toString = execution(void com.example.aop.example.service.EventService.exceptionTest())
  arg = 
[Around-Package]
  toString = execution(void com.example.aop.example.service.EventService.exceptionTest())
  arg = 
[Before]
  arg = 
  toString = execution(void com.example.aop.example.service.EventService.exceptionTest())
[AfterThrowing]
  toString = execution(void com.example.aop.example.service.EventService.exceptionTest())
  arg = 
  exception = Exception message
[After]
  arg = 
  toString = execution(void com.example.aop.example.service.EventService.exceptionTest())
Controller Exception! message = Exception message
Controller end
[AfterReturning]
  arg = 
  toString = execution(String com.example.aop.example.controller.EventController.test())
  response = TEST END
[After]
  arg = 
  toString = execution(String com.example.aop.example.controller.EventController.test())
[Around-Package]
  toString = execution(String com.example.aop.example.controller.EventController.test())
  Response : TEST END
  Runtime : 1044
[Around]
  toString = execution(String com.example.aop.example.controller.EventController.test())
  Response : TEST END
  Runtime : 1047
```