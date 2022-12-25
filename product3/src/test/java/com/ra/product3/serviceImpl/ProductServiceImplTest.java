package com.ra.product3.serviceImpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import com.ra.product3.entity.Product;
import com.ra.product3.repository.ProductRepository;
import com.ra.product3.service.ProductService;
@SpringBootTest
class ProductServiceImplTest {
	@Autowired
	private ProductService productService;
	
	@MockBean
	private ProductRepository productRepository;
	
//	
//	public void testGetProductById_Success() {
//		String product_name="abc";
//		ResponseEntity<Product> product = productService.getProductById((long) 1);
//		assertEquals(product_name, ((Product) product).getName());
//	}

}
