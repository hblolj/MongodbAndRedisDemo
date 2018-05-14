package com.hblolj.mongodbdemo.service;

import com.hblolj.mongodbdemo.bean.Demo;

/**
 * @author: hblolj
 * @Date: 2018/5/14 9:38
 * @Description:
 * @Version: 1.0
 **/
public interface DemoService {

    Demo selectById(Long id);

    Demo selectByName(String name);

    void save(Demo demo);
}
