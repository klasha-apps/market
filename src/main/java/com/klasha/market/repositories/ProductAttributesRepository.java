package com.klasha.market.repositories;

import com.klasha.market.model.ProductAttributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAttributesRepository extends JpaRepository<ProductAttributes, Long> {

}
