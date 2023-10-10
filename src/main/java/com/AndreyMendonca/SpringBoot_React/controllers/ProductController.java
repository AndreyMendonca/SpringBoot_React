package com.AndreyMendonca.SpringBoot_React.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AndreyMendonca.SpringBoot_React.entities.Product;
import com.AndreyMendonca.SpringBoot_React.services.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public Iterable<Product> findAll(){
		return service.findAll();
	}
	
}
