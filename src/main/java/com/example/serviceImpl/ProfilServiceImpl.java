package com.example.serviceImpl;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProfilDTO;
import com.example.demo.mappers.ProfilMapper;
import com.example.demo.model.Profil;
import com.example.demo.repository.ProfilRepository;
import com.example.demo.service.ProfilService;
@Service
public class ProfilServiceImpl implements ProfilService {

private ProfilRepository profilRepository;

	

	@Override
	public ProfilDTO addOneProfil(ProfilDTO profil) {
		return ProfilMapper.convertToDto(profilRepository.save(ProfilMapper.convertToEntity(profil)));

	}

	@Override
	public void deleteOneProfil(long id) {
		profilRepository.deleteById(id);
	
	}

	@Override
	public Page<ProfilDTO> getAllProfil(Pageable pageable) {
		Page<Profil> profils=profilRepository.findAll(pageable);
		return profils.map(ProfilMapper::convertToDto);

	}

	

}
