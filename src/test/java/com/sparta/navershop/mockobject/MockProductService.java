package com.sparta.navershop.mockobject;

import com.sparta.navershop.dto.ProductMypriceRequestDto;
import com.sparta.navershop.dto.ProductRequestDto;
import com.sparta.navershop.model.Product;

import java.util.List;


public class MockProductService {

    private final MockProductRepository mockProductRepository;
    public static final int MIN_MY_PRICE = 100;

    public MockProductService() {
        this.mockProductRepository = new MockProductRepository();
    }

    public Product createProduct(ProductRequestDto requestDto) {
// 요청받은 DTO 로 DB에 저장할 객체 만들기
        Product product = new Product(requestDto);

        mockProductRepository.save(product);

        return product;
    }

    public Product updateProduct(Long id, ProductMypriceRequestDto requestDto) {
        int myprice = requestDto.getMyprice();
        if (myprice < MIN_MY_PRICE) {
            throw new IllegalArgumentException("유효하지 않은 관심 가격입니다. 최소 " + MIN_MY_PRICE + " 원 이상으로 설정해 주세요.");
        }

        Product product = mockProductRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("해당 아이디가 존재하지 않습니다."));

        product.setMyprice(myprice);
        mockProductRepository.save(product);

        return product;
    }

    // (관리자용) 상품 전체 조회
    public List<Product> getAllProducts() {
        return mockProductRepository.findAll();
    }
}