package com.klasha.market.repositories;

import com.klasha.market.model.DeliveryAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryAddressRepository extends JpaRepository<DeliveryAddress, Long> {

}