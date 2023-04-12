package com.example.demo5.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.dto.User;

@RestController
@Validated // Get 방식일 때 반드시 선언 해주어야 유효성 검사를 시작한다.
public class UserController {

	// Get 방식일때 파라미터 앞에 어떤 유효성 검사를 할 지
	// 당연히 지정해 주어야 한다.

	// http://localhost:8080/user?name=홍길동&age=1
	// GET 방식일때 valid 처리
	@GetMapping("/user")
	public User user(@Size(min = 2) @RequestParam String name, @NotNull @Min(1) @RequestParam Integer age) {
		User user = new User();
		user.setAge(10);
		user.setName("야스오");
		return user;
	}

	@GetMapping("/user2")
	public User user2(@Size(min = 2) @RequestParam String name, @NotNull @Min(20) @RequestParam Integer age) {
		User user2 = new User();
		user2.setName("홍아");
		user2.setAge(27);
		return user2;
	}

	@GetMapping("/user3")
	public User user3(@Size(min = 1) @RequestParam String name, @NotNull @Min(20) @RequestParam Integer age) {
		User user3 = new User();
		user3.setName("향아");
		user3.setAge(28);
		return user3;
	}

	// http://localhost:8080/user4?name=홍길동&age=1
	@GetMapping("/user4")
	// object mapper 통해서 파싱 처리하고 싶다면
	public User user4(@Validated User user) {
		return user;
	}
}
