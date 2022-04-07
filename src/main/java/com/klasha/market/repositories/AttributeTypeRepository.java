package com.klasha.market.repositories;

import com.klasha.market.model.AttributeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttributeTypeRepository extends JpaRepository<AttributeType, Long> {

}
