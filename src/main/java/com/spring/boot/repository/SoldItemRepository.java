package com.spring.boot.repository;

import com.spring.boot.entity.SoldItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sahan on 4/21/16.
 */
public interface SoldItemRepository extends JpaRepository<SoldItem, Long> {
}
