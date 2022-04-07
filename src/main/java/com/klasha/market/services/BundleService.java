package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Bundle;
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
public class BundleService implements CrudService<Bundle, Long> {


    @Override
    public List<Bundle> findAll() {
        return null;
    }

    @Override
    public Bundle findById(Long aLong) {
        return null;
    }

    @Override
    public Bundle save(Bundle object) {
        return null;
    }

    @Override
    public void delete(Bundle object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Bundle> findAllByPage(Pageable pageable) {
        return null;
    }
}
