package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Wishlist;
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
public class WishlistService implements CrudService<Wishlist, Long> {


    @Override
    public List<Wishlist> findAll() {
        return null;
    }

    @Override
    public Wishlist findById(Long aLong) {
        return null;
    }

    @Override
    public Wishlist save(Wishlist object) {
        return null;
    }

    @Override
    public void delete(Wishlist object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Wishlist> findAllByPage(Pageable pageable) {
        return null;
    }
}
