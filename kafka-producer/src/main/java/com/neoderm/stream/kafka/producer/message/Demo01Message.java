package com.neoderm.stream.kafka.producer.message;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Demo01Message implements Serializable {

    private Integer id;
}