package com20.final5.dto;

import com20.final5.entity.Product;

public record ProductRequest(
        String name, String description, String category, Double price
) {
    public static Product requestToEntity(ProductRequest productRequest) {
        return new Product(
                productRequest.name(),
                productRequest.description(),
                productRequest.category(),
                productRequest.price()
        );
    }
}
