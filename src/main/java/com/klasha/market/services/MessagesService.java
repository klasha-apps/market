package com.klasha.market.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Activity;
import com.klasha.market.model.Messages;
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
public class MessagesService implements CrudService<Messages, Long> {


    @Override
    public List<Messages> findAll() {
        return null;
    }

    @Override
    public Messages findById(Long aLong) {
        return null;
    }

    @Override
    public Messages save(Messages object) {
        return null;
    }

    @Override
    public void delete(Messages object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<Messages> findAllByPage(Pageable pageable) {
        return null;
    }
}
