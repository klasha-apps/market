package com.klasha.market.repositories;

import com.klasha.market.model.Condition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {

}
