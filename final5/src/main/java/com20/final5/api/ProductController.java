package com20.final5.api;

import com20.final5.dto.ProductRequest;
import com20.final5.dto.ProductResponse;
import com20.final5.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @Operation(summary = "to save new product")
    ProductResponse save(@RequestBody ProductRequest productRequest) {
        return productService.save(productRequest);
    }

    @GetMapping
    @Operation(summary = "to get all products")
    List<ProductResponse> getAll() {
        return productService.getAll();
    }

    @GetMapping("/getById")
    @Operation(summary = "to get product by id")
    ProductResponse getById(@RequestParam Long id) {
        return productService.getById(id);
    }

    @GetMapping("/filterByCategory")
    @Operation(summary = "to filter products by category")
    List<ProductResponse> filterByCategory(@RequestParam String category) {
        return productService.filterByCategory(category);
    }

    @GetMapping("/sortByPrice")
    @Operation(summary = "to sort products by price")
    List<ProductResponse> sortByPrice(@RequestParam Double minPrice, @RequestParam Double maxPrice) {
        return productService.sortByPrice(minPrice, maxPrice);
    }
}
