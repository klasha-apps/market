package com.klasha.market.repositories;

import com.klasha.market.model.CartOrderTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartOrderTransactionRepository extends JpaRepository<CartOrderTransaction, Long> {

}
