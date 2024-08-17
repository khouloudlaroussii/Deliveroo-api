package com.example.serviceImpl;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AdresseDTO;
import com.example.demo.dto.DemandeDTO;
import com.example.demo.dto.EvaluationDTO;
import com.example.demo.dto.LivraisonDTO;
import com.example.demo.dto.PickupDTO;
import com.example.demo.dto.ProfilDTO;
import com.example.demo.dto.ReclamationDTO;
import com.example.demo.dto.UtilisateurDTO;
import com.example.demo.mappers.AdresseMapper;
import com.example.demo.mappers.DemandeMapper;
import com.example.demo.mappers.LivraisonMapper;
import com.example.demo.mappers.PickupMapper;
import com.example.demo.mappers.ProfilMapper;
import com.example.demo.mappers.ReclamationMapper;
import com.example.demo.mappers.UtilisateurMapper;
import com.example.demo.model.Adresse;
import com.example.demo.model.Demande;
import com.example.demo.model.Livraison;
import com.example.demo.model.Pickup;
import com.example.demo.model.Profil;
import com.example.demo.model.Reclamation;
import com.example.demo.model.Utilisateur;
import com.example.demo.repository.AdresseRepository;
import com.example.demo.repository.DemandeRepository;

import com.example.demo.repository.LivraisonRepository;
import com.example.demo.repository.PickupRepository;
import com.example.demo.repository.ProfilRepository;
import com.example.demo.repository.ReclamationRepository;
import com.example.demo.repository.UtilisateurRepository;
import com.example.demo.service.UtilisateurService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@Autowired
	private ReclamationRepository reclamationRepository;
	@Autowired
	private ProfilRepository profilRepository;
	@Autowired
	private PickupRepository pickupRepository;
	@Autowired
	private LivraisonRepository livraisonRepository;
	@Autowired
	private DemandeRepository demandeRepository;
	@Autowired
	private AdresseRepository adresseRepository;

	@Override
	public UtilisateurDTO addOneUtilisateur(UtilisateurDTO utilisateur) {
		return UtilisateurMapper.convertToDto(utilisateurRepository.save(UtilisateurMapper.convertToEntity(utilisateur)));
	}

	@Override
	public void deleteOneUtilisateur(long id) {
		utilisateurRepository.deleteById(id);
		
	}

	@Override
	public Optional<UtilisateurDTO> findOneUtilisateur(long id) {
		return utilisateurRepository.findById(id).map(UtilisateurMapper::convertToDto);
	}

	@Override
	public UtilisateurDTO assignReclamationToUtilisateur(long id, ReclamationDTO reclamation) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Reclamation rec=ReclamationMapper.convertToEntity(reclamation);
			rec.setUtilisateur(utilisateur);
			reclamationRepository.save(rec);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;}

	@Override
	public UtilisateurDTO assignProfilToUtilisateur(long id, ProfilDTO profil) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Profil pro=ProfilMapper.convertToEntity(profil);
			pro.setUtilisateur(utilisateur);
			profilRepository.save(pro);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}

	@Override
	public UtilisateurDTO assignPickupToUtilisateur(long id, PickupDTO pickup) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Pickup pic=PickupMapper.convertToEntity(pickup);
			pic.setUtilisateur(utilisateur);
			pickupRepository.save(pic);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}

	@Override
	public UtilisateurDTO assignLivraisonToUtilisateur(long id, LivraisonDTO livraison) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Livraison liv=LivraisonMapper.convertToEntity(livraison);
			liv.setUtilisateur(utilisateur);
			livraisonRepository.save(liv);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}


	@Override
	public UtilisateurDTO assignDemandeToUtilisateur(long id, DemandeDTO demande) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Demande dem=DemandeMapper.convertToEntity(demande);
			dem.setUtilisateur(utilisateur);
			demandeRepository.save(dem);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}

	@Override
	public UtilisateurDTO assignAdresseToUtilisateur(long id, AdresseDTO adresse) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Adresse adr=AdresseMapper.convertToEntity(adresse);
			adr.setUtilisateur(utilisateur);
			adresseRepository.save(adr);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}

	@Override
	public Page<UtilisateurDTO> getAllUtilisateurs(Pageable pageable) {
			Page<Utilisateur> users=utilisateurRepository.findAll(pageable);
			return users.map(UtilisateurMapper::convertToDto);
	}
	@Override
	public UtilisateurDTO assignEvaluationToUtilisateur(long id, EvaluationDTO evaluation) {
		// TODO Auto-generated method stub
		return null;
	}








	

	


}
