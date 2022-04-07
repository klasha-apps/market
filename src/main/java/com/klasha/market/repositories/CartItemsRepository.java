package com.klasha.market.repositories;

import com.klasha.market.model.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartItemsRepository extends JpaRepository<CartItems, Long> {

}
