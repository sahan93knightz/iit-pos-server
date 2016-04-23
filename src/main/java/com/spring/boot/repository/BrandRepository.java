package com.spring.boot.repository;

import com.spring.boot.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by sahan on 4/21/16.
 */
@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

    Collection<Brand> findByNameLike(@Param(value = "name") String name);


}
