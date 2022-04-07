package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.StoreRating;
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
public class StoreRatingService implements CrudService<StoreRating, Long> {


    @Override
    public List<StoreRating> findAll() {
        return null;
    }

    @Override
    public StoreRating findById(Long aLong) {
        return null;
    }

    @Override
    public StoreRating save(StoreRating object) {
        return null;
    }

    @Override
    public void delete(StoreRating object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<StoreRating> findAllByPage(Pageable pageable) {
        return null;
    }
}
