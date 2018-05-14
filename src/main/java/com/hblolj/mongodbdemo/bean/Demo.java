package com.hblolj.mongodbdemo.bean;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author: hblolj
 * @Date: 2018/5/14 9:36
 * @Description:
 * @Version: 1.0
 **/
public class Demo implements Serializable{

    @Id
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
