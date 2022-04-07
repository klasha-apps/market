package com.klasha.market.repositories;

import com.klasha.market.model.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CollectionRepository extends JpaRepository<Collection, Long> {

}
