package com.liveasy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.liveasy.entities.Payload;

@Repository
public interface  loadDao extends JpaRepository<Payload, Long> {

}
