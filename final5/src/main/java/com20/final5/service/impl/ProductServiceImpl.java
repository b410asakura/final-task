package com20.final5.service.impl;

import com20.final5.dto.ProductRequest;
import com20.final5.dto.ProductResponse;
import com20.final5.entity.Product;
import com20.final5.globalException.NotFoundException;
import com20.final5.repo.ProductRepository;
import com20.final5.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public ProductResponse save(ProductRequest productRequest) {
//        Product product = new Product();
//        product.setName(productRequest.name());
//        product.setDescription(productRequest.description());
//        product.setCategory(productRequest.category());
//        product.setPrice(productRequest.price());
        Product product = ProductRequest.requestToEntity(productRequest);
        productRepository.save(product);
        return ProductResponse.entityToResponse(product);
    }

    @Override
    public List<ProductResponse> getAll() {
        return productRepository.getAll();
    }

    @Override
    public ProductResponse getById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no product with id: " + id
                )
        );
        return ProductResponse.entityToResponse(product);
    }

    @Override
    public List<ProductResponse> filterByCategory(String category) {
        return productRepository.filterByCategory(category);
    }

    @Override
    public List<ProductResponse> sortByPrice(Double minPrice, Double maxPrice) {
        return productRepository.sortByPrice(minPrice, maxPrice);
    }
}
