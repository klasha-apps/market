package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.AttributeType;
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
public class AttributeTypeService implements CrudService<AttributeType, Long> {

    @Override
    public List<AttributeType> findAll() {
        return null;
    }

    @Override
    public AttributeType findById(Long aLong) {
        return null;
    }

    @Override
    public AttributeType save(AttributeType object) {
        return null;
    }

    @Override
    public void delete(AttributeType object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<AttributeType> findAllByPage(Pageable pageable) {
        return null;
    }
}
