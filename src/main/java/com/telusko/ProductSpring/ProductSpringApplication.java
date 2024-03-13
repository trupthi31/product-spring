package com.telusko.ProductSpring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);
		
		ProductService service = context.getBean(ProductService.class);// i want a object
		//service.show();
		
		List<Product> products = service.getAllProduct();
		// enhance for loop
		for(Product p :products) {
		System.out.println(p);
		}
	}

}
