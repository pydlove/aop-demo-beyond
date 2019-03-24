package com.study.pany.bean.aopDemo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Compere {

    @Before("execution(* com.study.pany.bean.aopDemo1.IEvening.sing(String, String)) && args(singer, song)")
    public void host1(String singer, String song) {
        System.out.println("有请" + singer + "上场表演"+ song);
    }

    @Around("execution(* com.study.pany.bean.aopDemo1.IEvening.sing(..))")
    public void validate(ProceedingJoinPoint jp){
        try{
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @AfterReturning("execution(* com.study.pany.bean.aopDemo1.IEvening.sing(String, String)) && args(singer, song)")
    public void host2(String singer, String song){
        System.out.println("刚刚" + singer + "表演的" + song + "真是太精彩了" );
    }

    @AfterThrowing(pointcut = "execution(* com.study.pany.bean.aopDemo1.IEvening.*(..))", throwing = "throwable")
    public void host3(Throwable throwable){
        System.out.println("抱歉，" + "今晚出了状况，需要临时终止演出:" + throwable);
    }

    @Before("execution(* com.study.pany.bean.aopDemo1.IEvening.dance(String)) && args(singer))")
    public void host3(String singer) {
        System.out.println("下一个节目，有请" + singer + "表演跳舞" );
    }

}
