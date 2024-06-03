package com.example.demo.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.dto.UtilisateurDTO;
import com.example.demo.model.Reclamation;

public interface UtilisateurService {

	public Page<UtilisateurDTO> getAllUtilisateurs(Pageable pageable) ;
	public UtilisateurDTO addOneUtilisateur(UtilisateurDTO utilisateur);
	public void deleteOneUtilisateur(long id);
	public Optional<UtilisateurDTO> findOneUtilisateur(long id);
	public UtilisateurDTO assignReclamationToUtilisateur(long id ,Reclamation reclamation);
}
