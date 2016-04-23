package com.spring.boot.repository;

import com.spring.boot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by sahan on 4/20/16.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Collection<Item> findByNameLike(@Param(value = "name") String name);

}
