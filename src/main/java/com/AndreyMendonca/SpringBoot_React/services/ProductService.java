package com.AndreyMendonca.SpringBoot_React.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.AndreyMendonca.SpringBoot_React.entities.Product;
import com.AndreyMendonca.SpringBoot_React.entities.ProductResponse;
import com.AndreyMendonca.SpringBoot_React.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private ProductResponse response;
	
	public Iterable<Product> findAll(){
		return repository.findAll();
	}
	
	//cadastrar produtos
	public ResponseEntity<?> save(Product product){
		//validar se o produto for cadastrado
		if(product.getName().equals("")) {
			response.setMessagem("O nome é obrigátorio!");
			return new ResponseEntity<ProductResponse>(response, HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<Product>(repository.save(product),HttpStatus.CREATED);
		}
	}
}
