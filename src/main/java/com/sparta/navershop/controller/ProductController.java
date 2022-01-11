package com.sparta.navershop.controller;

import com.sparta.navershop.Product;
import com.sparta.navershop.ProductRequestDto;
import com.sparta.navershop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;


@RestController // JSON으로 데이터를 주고받음을 선언합니다.
public class ProductController {

    // 신규 상품 등록
    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto) throws SQLException {
        ProductService productService = new ProductService();
        return productService.createProduct(requestDto);
    }
}