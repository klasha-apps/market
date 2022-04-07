package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Voucher;
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
public class VoucherService implements CrudService<Voucher, Long> {


    @Override
    public List<Voucher> findAll() {
        return null;
    }

    @Override
    public Voucher findById(Long aLong) {
        return null;
    }

    @Override
    public Voucher save(Voucher object) {
        return null;
    }

    @Override
    public void delete(Voucher object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Voucher> findAllByPage(Pageable pageable) {
        return null;
    }
}
