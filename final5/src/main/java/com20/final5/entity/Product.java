package com20.final5.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_gen"
    )
    @SequenceGenerator(
            name = "product_gen",
            sequenceName = "product_seq",
            allocationSize = 1
    )
    private Long id;
    private String name;
    private String description;
    private String category;
    private Double price;

    public Product(String name, String description, String category, Double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }
}
