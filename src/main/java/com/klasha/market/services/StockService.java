package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Stock;
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
public class StockService implements CrudService<Stock, Long> {


    @Override
    public List<Stock> findAll() {
        return null;
    }

    @Override
    public Stock findById(Long aLong) {
        return null;
    }

    @Override
    public Stock save(Stock object) {
        return null;
    }

    @Override
    public void delete(Stock object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Stock> findAllByPage(Pageable pageable) {
        return null;
    }
}
