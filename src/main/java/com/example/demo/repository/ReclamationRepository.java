package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Reclamation;
@Repository
public interface ReclamationRepository  extends JpaRepository<Reclamation, Long> {

}



