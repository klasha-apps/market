package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Tag;
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
public class TagService implements CrudService<Tag, Long> {


    @Override
    public List<Tag> findAll() {
        return null;
    }

    @Override
    public Tag findById(Long aLong) {
        return null;
    }

    @Override
    public Tag save(Tag object) {
        return null;
    }

    @Override
    public void delete(Tag object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Tag> findAllByPage(Pageable pageable) {
        return null;
    }
}
