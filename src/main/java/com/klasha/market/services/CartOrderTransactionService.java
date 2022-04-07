package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.CartOrderTransaction;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CartOrderTransactionService implements CrudService<CartOrderTransaction, Long> {


    @Override
    public List<CartOrderTransaction> findAll() {
        return null;
    }

    @Override
    public CartOrderTransaction findById(Long aLong) {
        return null;
    }

    @Override
    public CartOrderTransaction save(CartOrderTransaction object) {
        return null;
    }

    @Override
    public void delete(CartOrderTransaction object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<CartOrderTransaction> findAllByPage(Pageable pageable) {
        return null;
    }
}
