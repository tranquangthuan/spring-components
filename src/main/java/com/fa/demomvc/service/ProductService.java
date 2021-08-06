package com.fa.demomvc.service;

import java.util.List;

import com.fa.demomvc.entity.Product;

public interface ProductService {
	List<Product> findAll();

	void addNew(Product product);
}
