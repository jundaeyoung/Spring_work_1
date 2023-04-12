package com.example.demo6.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {

	@NotEmpty
	@Size(min = 1, max = 1, message="이름을 다시 확인해주세요")
	private String name;

	@Min(1)
	@NotNull
	@Max(30)
	private Integer age;
}
