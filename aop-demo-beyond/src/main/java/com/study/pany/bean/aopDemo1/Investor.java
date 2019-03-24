package com.study.pany.bean.aopDemo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-beyond.xml")
public class Investor {

    @Autowired
    private IEvening evening;

    @Test
    public void holdEvening() throws Exception {
        evening.sing("Beyond", "光辉岁月");
//        evening.dance("Beyond");
        IInteraction interaction = (IInteraction) this.evening;
        interaction.interact();
    }
}
