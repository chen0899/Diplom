package com.build.persistence.repository;

import com.build.persistence.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Long>{

    @Query("select h.image from Flat h where h.id=:id")
    String findImage(@Param("id") Long id);

}
