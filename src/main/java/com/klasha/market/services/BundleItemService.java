package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.BundleItem;
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
public class BundleItemService implements CrudService<BundleItem, Long> {


    @Override
    public List<BundleItem> findAll() {
        return null;
    }

    @Override
    public BundleItem findById(Long aLong) {
        return null;
    }

    @Override
    public BundleItem save(BundleItem object) {
        return null;
    }

    @Override
    public void delete(BundleItem object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<BundleItem> findAllByPage(Pageable pageable) {
        return null;
    }
}
