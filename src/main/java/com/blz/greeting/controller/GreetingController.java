package com.blz.greeting.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blz.greeting.model.Greeting;
import com.blz.greeting.model.User;
import com.blz.greeting.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@Autowired
	private IGreetingService iGreetingService;

	User user = new User();

	@GetMapping(value = { "/home" })
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		user.setFirstName(name);
		return iGreetingService.addGreeting(user);
	}

	@GetMapping("/getGreeting/{id}")
	public Optional<Greeting> getGreetingById(@PathVariable(value = "id") long id) {
		return iGreetingService.getGreetingById(id);
	}

	@GetMapping("/getAllGreetings")
	public List<Greeting> getAllGreeting() {
		return iGreetingService.getAllGreetings();
	}

	@PostMapping("/post")
	public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		user.setFirstName(name);
		return iGreetingService.addGreeting(user);
	}

	@PutMapping("/editGreeting/{id}")
	public Optional<Greeting> editGreetingById(@PathVariable("id") long id, @RequestParam(value = "name") String name) {
		return iGreetingService.editGreetingById(id, name);
	}
}