//package net.engineeringdigest.journalApp.service;
//
//import net.engineeringdigest.journalApp.model.SentimentData;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//public class SentimentProducerService {
//    @Autowired
//    private KafkaTemplate<String, SentimentData> kafkaTemplate;
//
//    private static final String TOPIC = "weekly_sentiments";
//
//    public void sendSentiment(SentimentData sentimentData) {
//        kafkaTemplate.send(TOPIC, sentimentData);
//    }
//}
