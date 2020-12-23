package com.blz.greeting.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blz.greeting.model.Greeting;
import com.blz.greeting.model.User;
import com.blz.greeting.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Optional<Greeting> getGreetingById(long id) {
		Optional<Greeting> greeting = greetingRepository.findById(id);
		return greeting;
	}

	@Override
	public List<Greeting> getAllGreetings() {
		List<Greeting> greetings = new ArrayList<>();
		greetingRepository.findAll().forEach(greeting -> greetings.add(greeting));
		return greetings;
	}

}