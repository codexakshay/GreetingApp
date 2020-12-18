package com.blz.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.blz.greeting.component.DemoBean;

@SpringBootApplication
public class GreetingAppApplication {

	public static Logger logger = LoggerFactory.getLogger(GreetingAppApplication.class);

	public static void main(String[] args) {
		
		logger.debug("Welcome to spring concept demo !!!");
		ApplicationContext context = SpringApplication.run(GreetingAppApplication.class, args);
		logger.debug("Checking context:" + context.getBean(DemoBean.class));
	}
}
