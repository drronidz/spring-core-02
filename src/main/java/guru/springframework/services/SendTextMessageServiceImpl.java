package guru.springframework.services;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/9/2022 2:33 PM
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class SendTextMessageServiceImpl implements SendTextMessageService {

    private Queue textMessageQueue;
    private JmsTemplate jmsTemplate;

    @Autowired
    public void setTextMessageQueue(Queue textMessageQueue) {
        this.textMessageQueue = textMessageQueue;
    }

    @Autowired
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendTextMessage(String message) {
        this.jmsTemplate.convertAndSend(this.textMessageQueue, message);
    }
}
