package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Comments;
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
public class CommentsService implements CrudService<Comments, Long> {


    @Override
    public List<Comments> findAll() {
        return null;
    }

    @Override
    public Comments findById(Long aLong) {
        return null;
    }

    @Override
    public Comments save(Comments object) {
        return null;
    }

    @Override
    public void delete(Comments object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Comments> findAllByPage(Pageable pageable) {
        return null;
    }
}
