package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Collection;
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
public class CollectionService implements CrudService<Collection, Long> {


    @Override
    public List<Collection> findAll() {
        return null;
    }

    @Override
    public Collection findById(Long aLong) {
        return null;
    }

    @Override
    public Collection save(Collection object) {
        return null;
    }

    @Override
    public void delete(Collection object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Collection> findAllByPage(Pageable pageable) {
        return null;
    }
}
