package com.SpringThahir.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductRestController {
	@PostMapping("/product")
	public String saveProduct(@RequestBody product p) {
	//logic persist
		System.out.println(p);
		
		return "Product Saved";
			
	}
	
	@JsonSerialize
	@GetMapping("/product/{pid}")
	
	public product getProduct(@PathVariable Integer pid) {
		product p=null;
		
		if(pid==100) {
		
		 p= new product(100,"KeyBoard",700.00);
		}
	else if (pid==101) {
		 p= new product(101,"HP",720.00);
	}
	return p;
	}
	
	@GetMapping("/products")
	public List<product>getProducts(){
		product p1=new product(100, "Mouse",700.00);
		product p2=new product(101, "HD",750.00);
		
		List<product> products=Arrays.asList(p1,p2);
		return products; 
	}
	
	
	
}
