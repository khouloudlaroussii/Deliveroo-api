package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Profil;
@Repository
public interface ProfilRepository  extends JpaRepository<Profil, Long> {

}


