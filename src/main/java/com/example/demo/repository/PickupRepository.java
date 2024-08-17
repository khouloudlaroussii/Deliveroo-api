package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pickup;


@Repository
public interface PickupRepository extends JpaRepository<Pickup, Long> {

}