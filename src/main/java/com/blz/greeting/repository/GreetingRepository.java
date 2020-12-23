package com.blz.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blz.greeting.model.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
