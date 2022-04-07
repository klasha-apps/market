package com.klasha.market.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductAttributes {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private Long attributeTypeId;

    private Long value;
}
