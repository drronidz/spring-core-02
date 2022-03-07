package guru.springframework.config;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/8/2022 12:15 AM
*/

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.h2.server.web.WebServlet;


@Configuration
public class H2ConsoleConfig {

    @Bean
    public ServletRegistrationBean h2Console() {
        String path = "/h2-console";
        String urlMapping = path.endsWith("/") ? path + "*" : path + "/*";
        return new ServletRegistrationBean(new WebServlet(), new String[]{urlMapping});
    }
}
