package com.neoderm.rocketmq.consumer.message;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Demo01Message implements Serializable {

    private Integer id;
}