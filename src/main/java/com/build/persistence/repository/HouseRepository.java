package com.build.persistence.repository;

import com.build.persistence.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<House,Long>{

    List<House> findTop3ByOrderByDataDesc();

}
