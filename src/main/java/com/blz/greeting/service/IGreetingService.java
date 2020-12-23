package com.blz.greeting.service;

import java.util.Optional;

import com.blz.greeting.model.Greeting;
import com.blz.greeting.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);

	Optional<Greeting> getGreetingById(long id);

}