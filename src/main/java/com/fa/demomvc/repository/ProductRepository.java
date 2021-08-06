package com.fa.demomvc.repository;

import java.util.List;

import com.fa.demomvc.entity.Product;

public interface ProductRepository {
	
	List<Product> findAll();
	
	void addNew(Product product);
}
