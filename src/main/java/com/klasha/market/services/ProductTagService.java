package com.klasha.market.services;

import com.klasha.market.model.Activity;
import com.klasha.market.model.ProductTag;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
public class ProductTagService implements CrudService<ProductTag, Long> {


    @Override
    public List<ProductTag> findAll() {
        return null;
    }

    @Override
    public ProductTag findById(Long aLong) {
        return null;
    }

    @Override
    public ProductTag save(ProductTag object) {
        return null;
    }

    @Override
    public void delete(ProductTag object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<ProductTag> findAllByPage(Pageable pageable) {
        return null;
    }
}
