package com.erkorkmaz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class BlogCommandLineRunner implements CommandLineRunner {

	@Autowired
	private BlogRepository repository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repository.findAll());
	}
}
