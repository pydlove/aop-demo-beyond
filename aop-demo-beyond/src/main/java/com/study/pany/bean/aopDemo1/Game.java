package com.study.pany.bean.aopDemo1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Game {

    @DeclareParents(value = "com.study.pany.bean.aopDemo1.IEvening+", defaultImpl = InteractionImpl.class)
    public IInteraction interaction;
}
