package com20.final5.dto;

import com20.final5.entity.Product;

public record ProductResponse(
        Long id, String name, String description, String category, Double price
) {
    public static ProductResponse entityToResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getCategory(),
                product.getPrice()
        );
    }
}
