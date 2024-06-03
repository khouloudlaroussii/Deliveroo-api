package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pickup;



public interface PickupRepository extends JpaRepository<Pickup, Long> {

}