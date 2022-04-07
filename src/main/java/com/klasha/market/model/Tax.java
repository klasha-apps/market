package com.klasha.market.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Tax {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Double value;
}
