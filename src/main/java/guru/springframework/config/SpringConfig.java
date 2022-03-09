package guru.springframework.config;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/8/2022 12:23 PM
*/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "guru.springframework")
public class SpringConfig extends WebMvcConfigurerAdapter {
}
