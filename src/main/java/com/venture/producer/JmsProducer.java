package com.venture.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
//@EnableJms
public class JmsProducer {

    @Autowired
    JmsTemplate jmsTemplate;
//	ConfigurableApplicationContext context = SpringApplication.run(MessageProducerApplication.class, args);
//	// Get JMS template bean reference
//	JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

//    @Value("${spring.activemq.queue}")
//    private String topic = "arya_queue";

    public void sendMessage(String message){
    	
//    	jmsTemplate.convertAndSend("New_Queue", message);
    	jmsTemplate.convertAndSend("newQueue", message);
//        try{
//            System.out.println("Attempting Send message to queue: ");
//            
//        } catch(Exception e){
//           System.out.println("Recieved Exception during send Message: "+ e);
//        }
    }
}