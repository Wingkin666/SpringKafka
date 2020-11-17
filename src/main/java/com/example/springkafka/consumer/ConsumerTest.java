package com.example.springkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class ConsumerTest {
    @KafkaListener(topics = "test12")
    public void showMessage(ConsumerRecord<?, ?> record){
        // 消费的哪个topic、partition的消息,打印出消息内容
        //System.out.println("简单消费："+record.offset()+"-"+record.partition()+"-"+record.value());
        log.info("消费："+record.offset()+"-"+record.partition()+"-"+record.value());
        //JSONObject json1 = JSONObject.parseObject((String) record.value());
        //log.info(json1.getString("yzd"));
        //log.info(json1.getString("fhh"));
    }

}
