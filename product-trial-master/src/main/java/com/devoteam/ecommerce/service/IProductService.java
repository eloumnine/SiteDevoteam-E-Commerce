package com.devoteam.ecommerce.service;

import java.util.List;

import com.devoteam.ecommerce.dto.ProductRequest;
import com.devoteam.ecommerce.dto.ProductResponse;



public interface IProductService {

	List<ProductResponse> getAllProducts();
	ProductResponse getProductById( Long id);
	ProductResponse saveProduct(ProductRequest productRequest);
	ProductResponse updateProduct(Long id, ProductRequest productRequest);
	void deleteProduct(Long id);
	
}
