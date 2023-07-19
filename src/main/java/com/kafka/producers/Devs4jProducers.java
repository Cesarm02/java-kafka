package com.kafka.producers;

import java.util.Properties;

public class Devs4jProducers {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "1");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserialize", "\"org.apache.kafka.common.serialization.StringDeserializer");
    }
}
