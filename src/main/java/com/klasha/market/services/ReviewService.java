package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Review;
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
public class ReviewService implements CrudService<Review, Long> {


    @Override
    public List<Review> findAll() {
        return null;
    }

    @Override
    public Review findById(Long aLong) {
        return null;
    }

    @Override
    public Review save(Review object) {
        return null;
    }

    @Override
    public void delete(Review object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Review> findAllByPage(Pageable pageable) {
        return null;
    }
}
