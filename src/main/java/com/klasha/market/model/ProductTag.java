package com.klasha.market.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductTag {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Tag tag;
}
