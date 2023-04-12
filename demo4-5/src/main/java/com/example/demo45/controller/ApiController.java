package com.example.demo45.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo45.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {

	// http://localhost:8080/api/user
	@PostMapping("/user")
	public ResponseEntity<User> user(@RequestBody User user) {
		// Spring boot 요청시에 데이터 기본 파싱 전략 key=value 구조
		// User user <-- DTO방식을 사용했기 때문에
		// object mapper 동작을 해서 자동 파싱해서 처리해준다.
		// 유효성 검사 - 예전 방식
		if (user.getAge() < 1 || user.getAge() > 100) {
			// 잘못된 입력값을 확인
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
		}
		// 서비스 만들어서 (로직) --> DAO --> DB(insert)
		// DB --> DAO --> 로직
		// 위 설명처럼 처럼 갔다가 다시 돌아온다.
		System.out.println(user);
		return ResponseEntity.ok(user);
	}

	@PostMapping("/user2")
	public ResponseEntity<User> user2(@Valid @RequestBody User user) {
		return ResponseEntity.ok(user);
	}

	// 와일드 카드 -> ? 사용가능 ( 상황에 따라 다른 데이터 타입으로 사용할 수 있다.)
	@PostMapping("/user3")
	public ResponseEntity<?> user3(@Valid @RequestBody User user, BindingResult bindingResult) {
		// bindingResult 클래스를 배워보자.
		// bindngResult 가 @Valid 에 대한 결과 값을 가지고 있다.
		if (bindingResult.hasErrors()) {
			// 에러발생
			// 필드 - 어떤 필드에서 에러 발생
			// 메세지 - 내용을 반환 처리

			StringBuilder sb = new StringBuilder();

			bindingResult.getAllErrors().forEach(error -> {
				System.out.println(error.getCode());
				System.out.println(error.getDefaultMessage());
				System.out.println(error.getArguments());
				System.out.println(error.getObjectName());
				sb.append("field : " + error.getCode());
				sb.append("\n");
				sb.append("message : " + error.getDefaultMessage());
				sb.append("\n");
			});

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
		}
		// 정상 처리
		return ResponseEntity.ok(user);
	}
}
