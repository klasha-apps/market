package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Product;
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
public class ProductService implements CrudService<Product, Long> {


    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long aLong) {
        return null;
    }

    @Override
    public Product save(Product object) {
        return null;
    }

    @Override
    public void delete(Product object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Product> findAllByPage(Pageable pageable) {
        return null;
    }
}
