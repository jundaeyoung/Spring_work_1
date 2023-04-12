package com.example.demo4_1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo4_1.dto.User;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@GetMapping("/get/{id}")
	public void get(@PathVariable Long id) {
		System.out.println("method : GET");
		System.out.println("method : " + id);
	}

	@PostMapping("/post")
	public ResponseEntity<User> post(@RequestBody User user) {
		System.out.println("method : POST");
		System.out.println("user : " + user.toString());
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
}
