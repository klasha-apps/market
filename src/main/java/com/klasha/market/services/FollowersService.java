package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Followers;
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
public class FollowersService implements CrudService<Followers, Long> {


    @Override
    public List<Followers> findAll() {
        return null;
    }

    @Override
    public Followers findById(Long aLong) {
        return null;
    }

    @Override
    public Followers save(Followers object) {
        return null;
    }

    @Override
    public void delete(Followers object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Followers> findAllByPage(Pageable pageable) {
        return null;
    }
}
