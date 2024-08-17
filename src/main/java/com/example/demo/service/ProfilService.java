package com.example.demo.service;

import java.awt.print.Pageable;
import org.springframework.data.domain.Page;

import com.example.demo.dto.ProfilDTO;

public interface ProfilService {
	public Page<ProfilDTO> getAllProfil(org.springframework.data.domain.Pageable pageable) ;
	public ProfilDTO  addOneProfil(ProfilDTO profil);
	public void deleteOneProfil(long id);

}
