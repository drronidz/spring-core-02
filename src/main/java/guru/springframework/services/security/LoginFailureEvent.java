package guru.springframework.services.security;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/5/2022 10:02 PM
*/

import org.springframework.context.ApplicationEvent;

public class LoginFailureEvent extends ApplicationEvent {
    public LoginFailureEvent(Object source) {
        super(source);
    }
}
