package com.aishwary.springcloud.productService.repos;

import com.aishwary.springcloud.productService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
