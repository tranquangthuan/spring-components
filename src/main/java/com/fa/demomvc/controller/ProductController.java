package com.fa.demomvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fa.demomvc.entity.Product;
import com.fa.demomvc.service.ProductService;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/all")
	public String getAll(Model model) {
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);

		return "products";
	}

	@GetMapping(value = "/new")
	public String goToNewProductPage(Model model) {
		model.addAttribute("product", new Product());

		return "newProduct";
	}

	@PostMapping(value = "/addNew")
	public String addNew(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
		System.out.println("product in addNew " + product);
		productService.addNew(product);
		redirectAttributes.addFlashAttribute("message", "Add new product success");
		redirectAttributes.addFlashAttribute("product", product);

		return "redirect:all";
	}

	@GetMapping(value = "/edit")
	public String edit(@RequestParam String id, Model model) {
		System.out.println("Edit Id = " + id);
		model.addAttribute("id", id);
		model.addAttribute("action", "edit");

		return "productDetail";
	}

	@GetMapping(value = "/delete/{id}")
	public String delete(@PathVariable String id, Model model) {
		System.out.println("Delete Id = " + id);
		model.addAttribute("id", id);
		model.addAttribute("action", "delete");

		return "productDetail";
	}

	@ModelAttribute("colorMasterList")
	public List<String> getColorMasterList() {
		List<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");

		return colors;
	}

	@ModelAttribute("countryMasterList")
	public List<String> getCountryMasterList() {
		List<String> coutries = new ArrayList<String>();
		coutries.add("Viet Nam");
		coutries.add("USA");
		coutries.add("Canada");

		return coutries;
	}

}
