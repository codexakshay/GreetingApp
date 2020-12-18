package com.blz.greeting.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{

	@Override
	public String greet() {
		return "Hello World";
	}
}
