package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Coupon;
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
public class CouponService implements CrudService<Coupon, Long> {


    @Override
    public List<Coupon> findAll() {
        return null;
    }

    @Override
    public Coupon findById(Long aLong) {
        return null;
    }

    @Override
    public Coupon save(Coupon object) {
        return null;
    }

    @Override
    public void delete(Coupon object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Coupon> findAllByPage(Pageable pageable) {
        return null;
    }
}
