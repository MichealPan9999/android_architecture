package com.example.mvvm.model;

import com.example.mvvm.base.BaseLoadListener;
import com.example.mvvm.bean.SimpleNewsBean;

public interface INewsModel {
    /**
     * 获取新闻数据
     *
     * @param page         页数
     * @param loadListener
     */
    void loadNewsData(int page, BaseLoadListener<SimpleNewsBean> loadListener);
}
