package com.AndreyMendonca.SpringBoot_React.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AndreyMendonca.SpringBoot_React.entities.Product;
import com.AndreyMendonca.SpringBoot_React.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Iterable<Product> findAll(){
		return repository.findAll();
	}
}
