package com.sparta.navershop.service;

import com.sparta.navershop.Product;
import com.sparta.navershop.ProductRequestDto;
import com.sparta.navershop.repository.ProductRepository;

import java.sql.SQLException;

public class ProductService {

    public Product createProduct(ProductRequestDto requestDto) throws SQLException {
        // 요청받은 DTO 로 DB에 저장할 객체 만들기
        Product product = new Product(requestDto);

        ProductRepository productRepository = new ProductRepository();
        productRepository.createProduct(product);

        return product;
    }
}