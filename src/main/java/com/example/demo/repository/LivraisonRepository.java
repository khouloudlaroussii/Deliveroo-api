package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Livraison;
@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Long> {

}
