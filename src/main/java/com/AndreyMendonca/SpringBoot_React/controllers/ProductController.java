package com.AndreyMendonca.SpringBoot_React.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AndreyMendonca.SpringBoot_React.entities.Product;
import com.AndreyMendonca.SpringBoot_React.entities.ProductResponse;
import com.AndreyMendonca.SpringBoot_React.services.ProductService;

@RestController
@RequestMapping(value="/products")
@CrossOrigin(origins = "*") // anotação para permitir que qualquer porta acesse nossa API
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public Iterable<Product> findAll(){
		return service.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Product product){
		return service.save(product);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody Product product){
		return service.update(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ProductResponse> delete(@PathVariable Long id){
		return service.delete(id);
	}
}
