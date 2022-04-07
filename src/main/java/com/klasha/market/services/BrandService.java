package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Brand;
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
public class BrandService implements CrudService<Brand, Long> {

    @Override
    public List<Brand> findAll() {
        return null;
    }

    @Override
    public Brand findById(Long aLong) {
        return null;
    }

    @Override
    public Brand save(Brand object) {
        return null;
    }

    @Override
    public void delete(Brand object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Brand> findAllByPage(Pageable pageable) {
        return null;
    }
}
