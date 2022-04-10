package com.example.rocketmqproducer.message;

import lombok.Data;

import java.io.Serializable;

@Data
public class Demo01Message implements Serializable {

    private Integer id;
}