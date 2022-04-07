package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Likes;
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
public class LikesService implements CrudService<Likes, Long> {


    @Override
    public List<Likes> findAll() {
        return null;
    }

    @Override
    public Likes findById(Long aLong) {
        return null;
    }

    @Override
    public Likes save(Likes object) {
        return null;
    }

    @Override
    public void delete(Likes object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Likes> findAllByPage(Pageable pageable) {
        return null;
    }
}
