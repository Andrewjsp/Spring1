package com.epam.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Before("execution(* com.epam.service.*.*(..))")
    public void beforeServiceMethodInvocation(JoinPoint pont) {
        System.out.println("Invocation of method" + pont.getSignature());
    }

    @Around("execution(* com.epam.service.*.*(..))")
    public Object aroundServiceMethodExecution(ProceedingJoinPoint point) throws Throwable {
        Object res = point.proceed();
        return res;
    }
}
