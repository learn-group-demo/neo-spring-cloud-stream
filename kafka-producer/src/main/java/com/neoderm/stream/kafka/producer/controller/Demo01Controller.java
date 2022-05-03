package com.neoderm.stream.kafka.producer.controller;

import com.alibaba.fastjson.JSON;
import com.neoderm.stream.kafka.producer.message.Demo01Message;
import com.neoderm.stream.kafka.producer.message.MySource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/demo01")
public class Demo01Controller {

    @Autowired
    private MySource mySource;

    @GetMapping("/send")
    public boolean send() {
        // <2>创建 Message
        Demo01Message message = new Demo01Message();
        message.setId(new Random().nextInt());
        // <3>创建 Spring Message 对象
        Message<Demo01Message> springMessage = MessageBuilder.withPayload(message)
                .build();
        // <4>发送消息
        log.info("\nproducer send topic: stream-kafka-topic message: {}",
                JSON.toJSONString(springMessage));
        return mySource.kafkaDemooutput().send(springMessage);
    }
}