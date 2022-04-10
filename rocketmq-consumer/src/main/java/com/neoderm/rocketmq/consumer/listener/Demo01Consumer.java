package com.neoderm.rocketmq.consumer.listener;

import com.neoderm.rocketmq.consumer.message.Demo01Message;
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
        logger.info("\nconsumer topic: ERBADAGANG-TOPIC-01 group: NEW-erbadagang-consumer-group-ERBADAGANG-TOPIC-01 \n [onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
    }

    @StreamListener(MySink.TREK_INPUT)
    public void onTrekMessage(@Payload Demo01Message message) {
        logger.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
    }
}