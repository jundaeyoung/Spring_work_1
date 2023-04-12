package com.example.demo5.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.dto.User;

import lombok.Builder;

@RestController
@RequestMapping("/api")
public class ApiController {

	@PostMapping("/user")
	public ResponseEntity<User> user(@RequestBody User user) {

		if (user.getAge() < 1 || user.getAge() > 100) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
		}
		System.out.println(user);
		return ResponseEntity.ok(user);
	}

	User user2 = User.builder().name("홍길동").age(14).email("1231@12312").build();

	// 두번째 연습
	// AOP 기반인 Vaildation 라이브러리 활용하기
	// 1. get 방식일때 사용방법과 POST 방식일 때 사용방법이 약간 다르다.
	// 반드시 Valid 선언을 해주어야한다.
	@PostMapping("/user2")
	public ResponseEntity<User> user2(@Valid @RequestBody User user) {
		// 관점 지향 패러다임 추가
		// AOP 기반에 valid 라이브러리를 활용하면 공통적으로 들어가야
		// 하는 부분에 코드를 분리시킬 수 있다.
		return ResponseEntity.ok(user);
	}

	@PostMapping("/user3")
	public ResponseEntity<?> user3(@Valid @RequestBody User user, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			StringBuilder sb = new StringBuilder();

			bindingResult.getAllErrors().forEach(error -> {
				System.out.println(error.getCode());
				System.out.println(error.getDefaultMessage());
				System.out.println(error.getArguments());
				System.out.println(error.getObjectName());

				sb.append(error.getCode());
				sb.append("\n");
				sb.append(error.getDefaultMessage());
				sb.append("\n");
			});

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
		}

		return ResponseEntity.ok(user);

	}

}
