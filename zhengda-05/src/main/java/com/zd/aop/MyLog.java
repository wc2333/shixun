package com.zd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLog {
    @Before("execution(* com.zd.service.*.*(..))")//在目标方法前切入
    public void before(JoinPoint joinPoint){
System.out.println("开始执行"+joinPoint.getTarget()+"的"+joinPoint.getSignature().getName()+"方法");
    }
}
