package guru.springframework.services.jms;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/9/2022 2:43 PM
*/

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TextMessageListener {

    @JmsListener(destination = "text.messagequeue")
    public void onMessage(String message) {
        System.out.println("############" + this.getClass().getSimpleName() + " ############");
        System.out.println("I GOT A MESSAGE");
        System.out.println(message);
        System.out.println("############" + this.getClass().getSimpleName() + " ############");
    }
}
