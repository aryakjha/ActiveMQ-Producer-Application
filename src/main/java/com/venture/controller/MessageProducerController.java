package com.venture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venture.producer.JmsProducer;

@RestController
@RequestMapping("/venture/v1")
public class MessageProducerController {
	
	
	@Autowired
	JmsProducer jmsProducer;
	
	
	 @PostMapping("/send")
	 public String sendMessage(@RequestBody String message) {
		 jmsProducer.sendMessage(message);
	   return "Message Sent";
	
	 }
}
