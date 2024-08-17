package com.example.demo.service;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.dto.LivraisonDTO;


public interface LivraisonService {

	public Page<LivraisonDTO> getAllLivraisons(Pageable pageable) ;
	public LivraisonDTO addOneLivraison(LivraisonDTO livraison);
	public void deleteOneLivraison(long id);
	public Optional<LivraisonDTO> findOneLivraison(long id);
}
