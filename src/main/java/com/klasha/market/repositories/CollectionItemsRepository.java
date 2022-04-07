package com.klasha.market.repositories;

import com.klasha.market.model.CollectionItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CollectionItemsRepository extends JpaRepository<CollectionItems, Long> {

}
