package com.kenobi.cafe.dao;

import com.kenobi.cafe.pojo.Product;
import com.kenobi.cafe.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    List<ProductWrapper> getAllProducts();
}
