package com.spring.boot.repository;

import com.spring.boot.entity.ReceivedItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sahan on 4/21/16.
 */
public interface ReceivedItemRepository extends JpaRepository<ReceivedItem, Long> {
}
