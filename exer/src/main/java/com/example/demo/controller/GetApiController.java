package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CustomerRequest;

@RestController
@RequestMapping("/api")
public class GetApiController {

	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}

	@GetMapping("/getQueryParam1")
	public String getQueryParam1(@RequestParam String name) {
		System.out.println("name>>>" + name);
		return "name : " + name;
	}

	@GetMapping("/getQueryParam2")
	public String getQueryParam2(@RequestParam String name, @RequestParam int age) {
		return "name : " + name + " age : " + age;
	}

	@GetMapping("/getQueryParam3")
	public String getQueryParam3(@RequestParam String name,
			@RequestParam(required = false, defaultValue = "20") int age) {
		return "name : " + name + " age :" + age;
	}

	@GetMapping("/getQueryParam4")
	public String getQueryParam4(@RequestParam Map<String, String> data) {
		StringBuilder sb = new StringBuilder();

		data.entrySet().forEach(set -> {
			System.out.println(set.getKey());
			System.out.println(set.getValue());
			System.out.println();
			sb.append(set.getKey() + " = " + set.getValue());
		});
		return sb.toString();
	}

	@GetMapping("/getqueryParam5")
	public String getqueryParam5(CustomerRequest customerDTO) {
		return customerDTO.toString();
	}

	@GetMapping("/path-variable/{userId}")
	public String pathVariable(@PathVariable int userId) {
		return " userId " + userId;
	}

	@GetMapping("/userId/{userId}/userName/{userName}")
	public String pathVariable(@PathVariable int userId, @PathVariable String userName) {
		return "userId : " + userId + " userName : " + userName;
	}

	@GetMapping("/username/{name}")
	public CustomerRequest getUser(CustomerRequest customerReq) {
		CustomerRequest customerRequest = new CustomerRequest();
		customerRequest.setName(customerReq.getName());

		return customerRequest;
	}

}
