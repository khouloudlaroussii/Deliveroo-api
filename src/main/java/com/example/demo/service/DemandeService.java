package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.demo.dto.DemandeDTO;



public interface DemandeService {
	public DemandeDTO  addOneDemande(DemandeDTO demande);
	public void deleteOneDemande(long id);
	Page<DemandeDTO> getAllDemande(Pageable pageable);

}
