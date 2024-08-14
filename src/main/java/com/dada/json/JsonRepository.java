package com.dada.json;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonRepository extends JpaRepository<Json,Long>{
    @Query("SELECT SUM(j.post_count) FROM Json j")
    Integer SumPostCount();
}
