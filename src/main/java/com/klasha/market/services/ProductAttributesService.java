package com.klasha.market.services;

import com.klasha.market.model.Activity;
import com.klasha.market.model.ProductAttributes;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
public class ProductAttributesService implements CrudService<ProductAttributes, Long> {


    @Override
    public List<ProductAttributes> findAll() {
        return null;
    }

    @Override
    public ProductAttributes findById(Long aLong) {
        return null;
    }

    @Override
    public ProductAttributes save(ProductAttributes object) {
        return null;
    }

    @Override
    public void delete(ProductAttributes object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<ProductAttributes> findAllByPage(Pageable pageable) {
        return null;
    }
}
