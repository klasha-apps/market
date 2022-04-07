package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.DeliveryAddress;
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
public class DeliveryAddressService implements CrudService<DeliveryAddress, Long> {


    @Override
    public List<DeliveryAddress> findAll() {
        return null;
    }

    @Override
    public DeliveryAddress findById(Long aLong) {
        return null;
    }

    @Override
    public DeliveryAddress save(DeliveryAddress object) {
        return null;
    }

    @Override
    public void delete(DeliveryAddress object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<DeliveryAddress> findAllByPage(Pageable pageable) {
        return null;
    }
}
