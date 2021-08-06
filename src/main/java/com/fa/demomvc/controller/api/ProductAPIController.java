package com.fa.demomvc.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fa.demomvc.api.model.ResponseResult;
import com.fa.demomvc.entity.Product;
import com.fa.demomvc.service.ProductService;

@RestController
@RequestMapping(value = "/api/products")
public class ProductAPIController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/all")
	public List<Product> getAll() {
		List<Product> products = productService.findAll();

		return products;
	}

	@GetMapping(value = "/edit")
	public ResponseResult edit(@RequestParam String id) {
		System.out.println("Edit Id = " + id);

		ResponseResult responseResult = new ResponseResult("success", "Id recive by @RequestParam = " + id,
				HttpStatus.OK.value());
		return responseResult;
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseResult delete(@PathVariable String id) {
		System.out.println("Delete Id = " + id);

		ResponseResult responseResult = new ResponseResult("success", "Id recive by @PathVariable = " + id,
				HttpStatus.OK.value());
		return responseResult;
	}

}
