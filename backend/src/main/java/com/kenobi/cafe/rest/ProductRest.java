package com.kenobi.cafe.rest;

import com.kenobi.cafe.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/product")
public interface ProductRest {
    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody Map<String, String> requestMap);
    @GetMapping("/get")
    public ResponseEntity<List<ProductWrapper>> getAllProducts();
    @PostMapping("/update")
    public ResponseEntity<String> updateProduct(@RequestBody Map<String, String> requestMap);
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer id);
    @PostMapping("/update-status")
    public ResponseEntity<String> updateStatus(@RequestBody Map<String, String> requestMap);
    @GetMapping("/category/{id}")
    public ResponseEntity<List<ProductWrapper>> getByCategory(@PathVariable Integer id);
    @GetMapping("/get/{id}")
    public ResponseEntity<ProductWrapper> getById(@PathVariable Integer id);
}
