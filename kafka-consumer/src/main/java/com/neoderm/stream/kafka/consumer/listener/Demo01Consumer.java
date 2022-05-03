package com.neoderm.stream.kafka.consumer.listener;

import com.neoderm.stream.kafka.consumer.message.Demo01Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Demo01Consumer {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @StreamListener(MySink.ERBADAGANG_INPUT)
    public void onMessage(@Payload Demo01Message message) {
        logger.info("\nconsumer topic: stream-kafka-topic \n [onMessage][线程编号:{} 消息内容：{}]",
                Thread.currentThread().getId(), message);
    }
}