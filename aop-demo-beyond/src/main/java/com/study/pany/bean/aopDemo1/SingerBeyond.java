package com.study.pany.bean.aopDemo1;

import org.junit.Assert;
import org.springframework.stereotype.Component;


@Component
public class SingerBeyond implements IEvening {

    @Override
    public void sing(String singer, String song) {
        Assert.assertNotNull(singer);
        Assert.assertNotNull(song);
        if("光辉岁月".equals(song)) {
            System.out.println("钟声响起归家的讯号......");
        }
    }

    @Override
    public void dance(String singer) throws Exception {
        throw new Exception("我身体不舒服，不能跳舞了");
    }
}
