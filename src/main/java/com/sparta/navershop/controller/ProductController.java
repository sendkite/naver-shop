package com.sparta.navershop.controller;

import com.sparta.navershop.Product;
import com.sparta.navershop.ProductRequestDto;
import com.sparta.navershop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@RestController // JSON으로 데이터를 주고받음을 선언합니다.
public class ProductController {

    // 신규 상품 등록
    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto) throws SQLException {
        ProductService productService = new ProductService();
        return productService.createProduct(requestDto);
    }

    // 전체 조회
    @GetMapping("/api/products")
    public List<Product> getProducts() throws SQLException {
        ProductService productService = new ProductService();
        List<Product> products = productService.getProducts();
        return products;
    }
}