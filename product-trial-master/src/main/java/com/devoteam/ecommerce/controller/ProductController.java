package com.devoteam.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devoteam.ecommerce.dto.ProductRequest;
import com.devoteam.ecommerce.dto.ProductResponse;
import com.devoteam.ecommerce.service.IProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping
	public ResponseEntity<List<ProductResponse>>  getAllProducts() {
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id) {
		ProductResponse productResponse = productService.getProductById(id);
		return ResponseEntity.ok(productResponse);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping
	public ResponseEntity<ProductResponse> saveProduct(@Valid @RequestBody ProductRequest productRequest) {
		ProductResponse productResponse = productService.saveProduct(productRequest);
		return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<ProductResponse> updateContact(@PathVariable Long id,@Valid @RequestBody ProductRequest productRequest) {
		ProductResponse productResponse = productService.updateProduct(id, productRequest);
		return ResponseEntity.accepted().body(productResponse);
	}

}
