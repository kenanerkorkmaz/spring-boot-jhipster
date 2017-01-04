package com.erkorkmaz;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BlogController {

	@Autowired
	private BlogRepository repository;

	@RequestMapping("/blogs")
	Collection<Blog> list() {
		return repository.findAll();
	}
}