package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Evaluation;

public interface EvalutionRepository extends JpaRepository<Evaluation, Long> {

}
