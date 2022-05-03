package com.neoderm.stream.kafka.consumer.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {

    String ERBADAGANG_INPUT = "stream-kafka-demo-input";

    @Input(ERBADAGANG_INPUT)
    SubscribableChannel demo01Input();
}