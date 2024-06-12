package com20.final5.repo;

import com20.final5.dto.ProductResponse;
import com20.final5.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select new com20.final5.dto.ProductResponse(p.id, p.name, p.description, p.category, p.price) from Product p")
    List<ProductResponse> getAll();

    @Query("select new com20.final5.dto.ProductResponse(p.id, p.name, p.description, p.category, p.price) from Product p " +
            "where p.category = :category")
    List<ProductResponse> filterByCategory(@Param("category") String category);

    @Query("select new com20.final5.dto.ProductResponse(p.id, p.name, p.description, p.category, p.price) from Product p " +
            "where p.price >= :minPrice and p.price <= :maxPrice")
    List<ProductResponse> sortByPrice(@Param("minPrice") Double minPrice, @Param("maxPrice") Double maxPrice);

}



