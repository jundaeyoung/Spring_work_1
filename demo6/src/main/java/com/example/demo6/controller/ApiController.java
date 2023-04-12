package com.example.demo6.controller;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo6.dto.User;

@RestController
@RequestMapping("/api")
@Validated // 하나씩 key=value 검사는 명시 해야 한다.
			// 단 DTO 방식은 예외
public class ApiController {
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}

	// 문제 유효성 검사 동작하도록 코드 변경하시오.
	// http://localhost:8080/api/user
	@GetMapping("/user")
	public User get(@Validated User user) {
		return user;
	}

	// 구분 : http body 데이터 전달 방식
	// 1. json 형식으로 넣어서 서버로 전달 @RequestBody 선언 해야함
	// 2. form 태그를 활용해서 key = value 구조 (Query String)
	// key = value는 @RequestBody 선언하면 안된다.
	@PostMapping("/user")
	public User post(@Valid @RequestBody User user) {
		System.out.println(user);
		return user;
	}

	// 두번째 연습
	// application/x-www-form-urlencoded
	@GetMapping("/user2")
	public User get2(@Validated User reqUser) {
		return reqUser;
	}

	@PostMapping("/userExer")
	public String exer(@Valid @RequestBody String name) {
		String username = "아트록스";
		return username;
	}

}
