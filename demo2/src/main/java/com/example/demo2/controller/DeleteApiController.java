package com.example.demo2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class DeleteApiController {

	// METHOD : DELETE
	// http://localhost:8080/api2/delete/{userId}?account=우리은행
	// http://localhost:8080/api2/delete/100?account=우리은행
	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable String userId, @RequestParam String account) {
		System.out.println("userId : " + userId);
		System.out.println("account : " + account);
	}
	
	// 문제 delete 주소 설계 및 응답 처리
	
	// http://localhost:8080/api2/deleteExer/userName?password=1234
	// http://localhost:8080/api2/deleteExer/전대영?password=1234
	@DeleteMapping("deleteExer/{userName}")
	public void deleteExer(@PathVariable String userName ,
			@RequestParam String password) {
		System.out.println("userName :" + userName);
		System.out.println("password :" + password);
		
	}
}
