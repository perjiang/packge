package com.jx.packge.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.weaver.ast.Var;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @ClassName aspect
 * @Description TODO
 * @Author
 * @Date 2022/7/13 16:56
 */
@Aspect
@Component
public class AllAspect {

    @Pointcut("execution( * com.jx.packge.controller.*.*(..))")
    private void limitFlowAspect() {

    }

    @Pointcut("@annotation(com.jx.packge.annotion.TestApi)")
    private void testApiAspect() {

    }

    @Before("limitFlowAspect()")
    public void before(JoinPoint joinpoint) throws ClassNotFoundException {
        MethodSignature methodSignature = (MethodSignature) joinpoint.getSignature();
        Method method = methodSignature.getMethod();
        Object[] args = joinpoint.getArgs();
        String className = joinpoint.getTarget().getClass().getName();
        System.out.println(className);
        Class<?> aClass = Class.forName(className);
        System.out.println(aClass.getName());
        Method[] methods = aClass.getMethods();
        for (Method m : methods) {

            System.err.println(m.getName());

        }

        System.out.println("method.getName" + method.getName());

    }

    @Before("testApiAspect()")
    public void before1(JoinPoint joinPoint) throws NoSuchMethodException {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        Method method = methodSignature.getMethod();

    }

}


