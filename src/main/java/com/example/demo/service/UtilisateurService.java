package com.example.demo.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.dto.AdresseDTO;
import com.example.demo.dto.DemandeDTO;
import com.example.demo.dto.EvaluationDTO;
import com.example.demo.dto.LivraisonDTO;
import com.example.demo.dto.PickupDTO;
import com.example.demo.dto.ProfilDTO;
import com.example.demo.dto.ReclamationDTO;
import com.example.demo.dto.UtilisateurDTO;

public interface UtilisateurService {	

	public Page<UtilisateurDTO> getAllUtilisateurs(Pageable pageable) ;
	public UtilisateurDTO addOneUtilisateur(UtilisateurDTO utilisateur);
	public void deleteOneUtilisateur(long id);
	public Optional<UtilisateurDTO> findOneUtilisateur(long id);
	public UtilisateurDTO assignReclamationToUtilisateur(long id ,ReclamationDTO reclamation);
	public  UtilisateurDTO  assignProfilToUtilisateur(long id ,ProfilDTO profil);
	public UtilisateurDTO assignPickupToUtilisateur(long id ,PickupDTO pickup);
	public UtilisateurDTO assignLivraisonToUtilisateur(long id ,LivraisonDTO livraison);
	public UtilisateurDTO assignEvaluationToUtilisateur(long id ,EvaluationDTO evaluation);
	public UtilisateurDTO assignDemandeToUtilisateur(long id ,DemandeDTO demande);
	public UtilisateurDTO assignAdresseToUtilisateur(long id ,AdresseDTO adresse);
	
}
