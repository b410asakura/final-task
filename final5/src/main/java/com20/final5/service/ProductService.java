package com20.final5.service;


import com20.final5.dto.ProductRequest;
import com20.final5.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse save(ProductRequest productRequest);

    List<ProductResponse> getAll();

    ProductResponse getById(Long id);

    List<ProductResponse> filterByCategory(String category);

    List<ProductResponse> sortByPrice(Double minPrice, Double maxPrice);

}
