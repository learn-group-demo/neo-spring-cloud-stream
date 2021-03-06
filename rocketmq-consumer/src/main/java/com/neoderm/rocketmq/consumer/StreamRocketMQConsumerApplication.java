package com.neoderm.rocketmq.consumer;

import com.neoderm.rocketmq.consumer.listener.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MySink.class)
public class StreamRocketMQConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamRocketMQConsumerApplication.class, args);
    }

}