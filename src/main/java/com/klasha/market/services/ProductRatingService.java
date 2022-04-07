package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.ProductRating;
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
public class ProductRatingService implements CrudService<ProductRating, Long> {


    @Override
    public List<ProductRating> findAll() {
        return null;
    }

    @Override
    public ProductRating findById(Long aLong) {
        return null;
    }

    @Override
    public ProductRating save(ProductRating object) {
        return null;
    }

    @Override
    public void delete(ProductRating object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<ProductRating> findAllByPage(Pageable pageable) {
        return null;
    }
}
