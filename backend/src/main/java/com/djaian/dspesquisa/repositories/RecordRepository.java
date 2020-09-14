package com.djaian.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djaian.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
