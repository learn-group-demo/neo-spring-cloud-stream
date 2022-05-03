package com.neoderm.stream.kafka.producer.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MySource {

    @Output("stream-kafka-demo-output")
    MessageChannel kafkaDemooutput();
}