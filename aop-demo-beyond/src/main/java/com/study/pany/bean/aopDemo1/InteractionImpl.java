package com.study.pany.bean.aopDemo1;

public class InteractionImpl implements IInteraction {

    @Override
    public void interact() {
        System.out.println("我们来一起做一个游戏，获胜者，我将送出自己的一张最新CD");
    }
}
