package com.klasha.market.repositories;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.klasha.market.model.Review;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDateTime;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
