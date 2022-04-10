package com.example.rocketmqproducer.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MySource {

    @Output("erbadagang-output")
    MessageChannel erbadagangOutput();

    @Output("trek-output")
    MessageChannel trekOutput();

}