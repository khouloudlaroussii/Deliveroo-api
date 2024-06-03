package com.example.demo.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.dto.UtilisateurDTO;
import com.example.demo.model.Reclamation;

public class UtilisateurServiceImpl implements UtilisateurService {

	@Override
	public Page<UtilisateurDTO> getAllUtilisateurs(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UtilisateurDTO addOneUtilisateur(UtilisateurDTO utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<UtilisateurDTO> findOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public UtilisateurDTO assignReclamationToUtilisateur(long id, Reclamation reclamation) {
		// TODO Auto-generated method stub
		return null;
	}

}
