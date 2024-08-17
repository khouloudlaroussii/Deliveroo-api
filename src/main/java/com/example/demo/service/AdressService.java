package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.dto.AdresseDTO;
public interface AdressService {
	public AdresseDTO  addOneAdresse(AdresseDTO adresse);
	public void deleteOneAdresse(long id);
	public Page<AdresseDTO> getAllAdresse(Pageable pageable);
	

}
