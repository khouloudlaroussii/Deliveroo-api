package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Adresse;


@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {


	

}
