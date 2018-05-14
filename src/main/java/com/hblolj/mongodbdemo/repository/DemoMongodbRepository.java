package com.hblolj.mongodbdemo.repository;

import com.hblolj.mongodbdemo.bean.Demo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: hblolj
 * @Date: 2018/5/14 9:36
 * @Description:
 * @Version: 1.0
 **/
public interface DemoMongodbRepository extends MongoRepository<Demo, Long>{

    Demo findDemoByName(String name);
}
