package com.fa.demomvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fa.demomvc.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private static List<Product> products = new ArrayList<Product>();

	static {
		products.add(new Product(1, "Nokia", 10));
		products.add(new Product(2, "Samsung", 10));
		products.add(new Product(3, "Iphone", 10));
	}

	@Override
	public List<Product> findAll() {
		return products;
	}

	@Override
	public void addNew(Product product) {
		products.add(product);
	}

}
