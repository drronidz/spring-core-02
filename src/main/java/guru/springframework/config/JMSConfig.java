package guru.springframework.config;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/9/2022 2:26 PM
*/

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;


@Configuration
public class JMSConfig {

    public static final String textMsgQueue = "text.messagequeue";

    @Bean
    public Queue textMessageQueue() {
        return new ActiveMQQueue(textMsgQueue);
    }
}
