package com.AndreyMendonca.SpringBoot_React.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AndreyMendonca.SpringBoot_React.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
