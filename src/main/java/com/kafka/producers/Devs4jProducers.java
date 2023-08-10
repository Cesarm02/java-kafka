package com.kafka.producers;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class Devs4jProducers {

    static Logger logger = LoggerFactory.getLogger(Devs4jProducers.class);
    public static void main(String[] args)  {
        long starTime = System.currentTimeMillis();
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092"); //Broker kafka
        props.put("acks", "1"); //performance
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer"); //Codificación
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("linger.ms", "6"); //Cada x sg envia los mensaje

        try(Producer<String, String> producer = new KafkaProducer<>(props)){
            for(int i = 0; i < 10000; i++){
                //Sin el get Asyncrona
                producer.send(new ProducerRecord<String, String>("devs4j-topic", String.valueOf(i), "devs4j-value"));
                        //.get();
            }
            producer.flush();
        }
        //Syncrona
      // catch (ExecutionException  | InterruptedException e) {
      //      logger.error("Message interruped", e);
       // }
        ///2056 ms send 10000
        logger.info("Proccesing time = {} ms", (System.currentTimeMillis()-starTime) );

    }
}
