package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Store;
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
public class StoreService implements CrudService<Store, Long> {


    @Override
    public List<Store> findAll() {
        return null;
    }

    @Override
    public Store findById(Long aLong) {
        return null;
    }

    @Override
    public Store save(Store object) {
        return null;
    }

    @Override
    public void delete(Store object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Store> findAllByPage(Pageable pageable) {
        return null;
    }
}
