package com.klasha.market.repositories;

import com.klasha.market.model.Tax;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;


@Repository
public interface TaxRepository extends JpaRepository<Tax, Long> {

}
