package com.klasha.market.services;

import com.klasha.market.model.Activity;
import com.klasha.market.model.Tax;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
public class TaxService implements CrudService<Tax, Long> {


    @Override
    public List<Tax> findAll() {
        return null;
    }

    @Override
    public Tax findById(Long aLong) {
        return null;
    }

    @Override
    public Tax save(Tax object) {
        return null;
    }

    @Override
    public void delete(Tax object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Tax> findAllByPage(Pageable pageable) {
        return null;
    }
}
