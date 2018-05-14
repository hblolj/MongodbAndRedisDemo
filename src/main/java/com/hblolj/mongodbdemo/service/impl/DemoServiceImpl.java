package com.hblolj.mongodbdemo.service.impl;

import com.hblolj.mongodbdemo.bean.Demo;
import com.hblolj.mongodbdemo.repository.DemoMongodbRepository;
import com.hblolj.mongodbdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: hblolj
 * @Date: 2018/5/14 9:39
 * @Description:
 * @Version: 1.0
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMongodbRepository mongodbRepository;

    @Override
    public Demo selectById(Long id) {
        return mongodbRepository.findById(id).get();
    }

    @Override
    public Demo selectByName(String name) {
        return mongodbRepository.findDemoByName(name);
    }

    @Override
    public void save(Demo demo) {
        mongodbRepository.save(demo);
    }
}
