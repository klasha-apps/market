package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
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
public class ActivityService implements CrudService<Activity, Long> {

    @Override
    public List<Activity> findAll() {
        return null;
    }

    @Override
    public Activity findById(Long aLong) {
        return null;
    }

    @Override
    public Activity save(Activity object) {
        return null;
    }

    @Override
    public void delete(Activity object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Activity> findAllByPage(Pageable pageable) {
        return null;
    }
}
