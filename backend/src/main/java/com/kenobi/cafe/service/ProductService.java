package com.kenobi.cafe.service;

import com.kenobi.cafe.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ProductService {
    public ResponseEntity<String> addProduct(Map<String, String> requestMap);

    public ResponseEntity<List<ProductWrapper>> getAllProducts();

    public ResponseEntity<String> updateProduct(Map<String, String> requestMap);
}
