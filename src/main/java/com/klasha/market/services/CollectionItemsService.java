package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.CollectionItems;
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
public class CollectionItemsService implements CrudService<CollectionItems, Long> {


    @Override
    public List<CollectionItems> findAll() {
        return null;
    }

    @Override
    public CollectionItems findById(Long aLong) {
        return null;
    }

    @Override
    public CollectionItems save(CollectionItems object) {
        return null;
    }

    @Override
    public void delete(CollectionItems object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<CollectionItems> findAllByPage(Pageable pageable) {
        return null;
    }
}
