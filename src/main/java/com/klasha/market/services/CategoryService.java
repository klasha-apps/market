package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Category;
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
public class CategoryService implements CrudService<Category, Long> {


    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(Long aLong) {
        return null;
    }

    @Override
    public Category save(Category object) {
        return null;
    }

    @Override
    public void delete(Category object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Category> findAllByPage(Pageable pageable) {
        return null;
    }
}
