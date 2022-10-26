package com.kenobi.cafe.rest;

import com.kenobi.cafe.pojo.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/category")
public interface CategoryRest {
    @PostMapping("/add")
    public ResponseEntity<String> addCategory(@RequestBody Map<String, String> requestMap);
    @GetMapping("/get")
    public ResponseEntity<List<Category>> getCategories(@RequestParam(required = false) String filterValue);
    @PostMapping("/update")
    public ResponseEntity<String> updateCategory(@RequestBody Map<String, String> requestMap);
}
