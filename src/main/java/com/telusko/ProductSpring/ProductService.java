package com.telusko.ProductSpring;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ProductService {
	
	@Autowired
	ProductDB db;
	
	public void show() {
		System.out.println("In show");
	}
//List<Product> products = new ArrayList(); don't need  
	
//	ProductDB db = new ProductDB();

//	public void addProduct(Product p) {
//	//	products.add(p);
//		db.save(p);
//		
//	}
//	
	public List<Product> getAllProduct(){
		
		return db.findAll();
	}
	// remove this part 
//	public Product getProduct(String name) {
//		for(Product p : products) {
//			if(p.getName().equals(name)) {
//				return p;
//				
//			}
//		}
//		return null;
//	}
//	
//	public List<Product> getProductWithText(String text){
//		String str = text.toLowerCase();
//		
//		List<Product> prods = new ArrayList();
//		for(Product p : products) {
//			String name = p.getName().toLowerCase();
//			String type = p.getType().toLowerCase();
//			String place = p.getPlace().toLowerCase();
//			
//			//if(p.getName().contains(text)||p.getType().contains(text)||p.getPlace().contains(text))
//			if(name.contains(str) || type.contains(str) || place.contains(str))
//			{
//				prods.add(p);
//			}
//		}
//		
//		
//		return prods;
//		
	}
	

