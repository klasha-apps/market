package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.CartItems;
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
public class CartItemsService implements CrudService<CartItems, Long> {


    @Override
    public List<CartItems> findAll() {
        return null;
    }

    @Override
    public CartItems findById(Long aLong) {
        return null;
    }

    @Override
    public CartItems save(CartItems object) {
        return null;
    }

    @Override
    public void delete(CartItems object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<CartItems> findAllByPage(Pageable pageable) {
        return null;
    }
}
