package com.study.pany.bean.aopDemo1;


/**
 * @Desc  晚会接口
 */
public interface IEvening {

    /**
     * @Desc  晚会表演方法
     * @Param  singer 歌手
     * @Param  song 歌曲名称
     */
    void sing(String singer, String song);


    void dance(String singer) throws Exception;
}