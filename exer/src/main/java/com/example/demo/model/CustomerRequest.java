package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class CustomerRequest {

	private int id;
	private String name;
	private String address;
	private String tel;
	
}
