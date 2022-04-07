package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Image;
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
public class ImageService implements CrudService<Image, Long> {


    @Override
    public List<Image> findAll() {
        return null;
    }

    @Override
    public Image findById(Long aLong) {
        return null;
    }

    @Override
    public Image save(Image object) {
        return null;
    }

    @Override
    public void delete(Image object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Image> findAllByPage(Pageable pageable) {
        return null;
    }
}
