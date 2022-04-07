package com.klasha.market.repositories;

import com.klasha.market.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface MessagesRepository extends JpaRepository<Messages, Long> {

    }