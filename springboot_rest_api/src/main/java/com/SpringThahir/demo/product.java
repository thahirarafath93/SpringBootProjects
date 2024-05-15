package com.SpringThahir.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class product {

	public product(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String name;
	private double price;
	
}
