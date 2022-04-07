package com.klasha.market.services;

import com.klasha.market.model.Activity;
import com.klasha.market.model.ProductCategory;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
public class ProductCategoryService implements CrudService<ProductCategory, Long> {


    @Override
    public List<ProductCategory> findAll() {
        return null;
    }

    @Override
    public ProductCategory findById(Long aLong) {
        return null;
    }

    @Override
    public ProductCategory save(ProductCategory object) {
        return null;
    }

    @Override
    public void delete(ProductCategory object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<ProductCategory> findAllByPage(Pageable pageable) {
        return null;
    }
}
