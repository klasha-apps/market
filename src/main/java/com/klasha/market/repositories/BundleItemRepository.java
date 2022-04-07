package com.klasha.market.repositories;

import com.klasha.market.model.BundleItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BundleItemRepository extends JpaRepository<BundleItem, Long> {

}
