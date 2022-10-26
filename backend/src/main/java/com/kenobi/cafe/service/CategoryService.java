package com.kenobi.cafe.service;

import com.kenobi.cafe.pojo.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    public ResponseEntity<String> addCategory(Map<String, String> requestMap);

    public ResponseEntity<List<Category>> getCategories(String filterValue);
    public ResponseEntity<String> updateCategory(Map<String, String> requestMap);
}
