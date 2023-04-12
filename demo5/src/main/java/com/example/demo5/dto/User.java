package com.example.demo5.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	@Size(max=3)
	private String name;
	@Max(10)
	private int age;
	@Email(message = "넌 이메일 형식도 모르니?")
	private String email;
	private String phoneNumber;

}
