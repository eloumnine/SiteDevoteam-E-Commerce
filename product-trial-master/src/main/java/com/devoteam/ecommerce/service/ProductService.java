package com.devoteam.ecommerce.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.devoteam.ecommerce.dao.ProductRepository;
import com.devoteam.ecommerce.dto.ProductRequest;
import com.devoteam.ecommerce.dto.ProductResponse;
import com.devoteam.ecommerce.entities.Product;
import com.devoteam.ecommerce.exception.EntiteNotFoundException;

@Service
public class ProductService implements IProductService{

	private ProductRepository productRepository;
	private ModelMapper modelMapper;
	
	
	
	public ProductService(ProductRepository productRepository, ModelMapper modelMapper) {
		super();
		this.productRepository = productRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll()
				.stream()
				.map(p -> modelMapper.map(p, ProductResponse.class))
				.collect(Collectors.toList());
	}

	/*
	 * @Override 
	 * public ProductResponse getProductById(Long id) { 
	 * 		// TODO Auto-generated method stub 
	 * 		Product product = productRepository.findById(id).orElse(null); 
	 * 		return modelMapper.map(product, ProductResponse.class); 
	 * }
	 */
	
	@Override
	public ProductResponse getProductById(Long id) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(id).orElseThrow(()-> new EntiteNotFoundException("Product Not Found"));
		return modelMapper.map(product, ProductResponse.class);
	}

	@Override
	public ProductResponse saveProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		Product productMapper = modelMapper.map(productRequest, Product.class);
		Product saveProduct = productRepository.save(productMapper);
		return modelMapper.map(saveProduct, ProductResponse.class);
	}

	@Override
	public ProductResponse updateProduct(Long id, ProductRequest productRequest) {
		// TODO Auto-generated method stub
		Optional<Product> optionalProduct = productRepository.findById(id);
		/******************************************************************/
		if(optionalProduct.isPresent()) {
			Product productMapper = modelMapper.map(productRequest, Product.class);
			
			productMapper.setCode(productRequest.getCode());
			productMapper.setName(productRequest.getName());
			productMapper.setDescription(productRequest.getDescription());
			productMapper.setImage(productRequest.getImage());
			productMapper.setCategory(productRequest.getCategory());
			productMapper.setPrice(productRequest.getPrice());
			productMapper.setQuantity(productRequest.getQuantity());
			productMapper.setInternalReference(productRequest.getInternalReference());
			productMapper.setShellId(productRequest.getShellId());
			productMapper.setRating(productRequest.getRating());
			productMapper.setCreatedAt(productRequest.getCreatedAt());
			productMapper.setUpdatedAt(productRequest.getUpdatedAt());
			productMapper.setInventoryStatus(productRequest.getInventoryStatus());
			
			Product productUpdated = productRepository.save(productMapper);
			return modelMapper.map(productUpdated, ProductResponse.class);
		}else {
			//throw new RuntimeException("Product Not Found");
			
			throw new EntiteNotFoundException("Product Not Found");
		}
		
	}

	
	/*
	 * @Override 
	 * public void deleteProduct(Long id) { 
	 * 		// TODO Auto-generated method stub 
	 * 		productRepository.deleteById(id); 
	 * }
	 */
	
	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		//productRepository.deleteById(id);
		Product product = productRepository.findById(id).get();
		productRepository.delete(product);	
	}
	
	

}
