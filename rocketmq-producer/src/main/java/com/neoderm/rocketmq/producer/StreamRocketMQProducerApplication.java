package com.neoderm.rocketmq.producer;

import com.neoderm.rocketmq.producer.message.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MySource.class)
@SpringBootApplication
public class StreamRocketMQProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamRocketMQProducerApplication.class, args);
    }

}
