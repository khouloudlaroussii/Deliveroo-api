package com.example.serviceImpl;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LivraisonDTO;
import com.example.demo.mappers.LivraisonMapper;
import com.example.demo.repository.LivraisonRepository;
import com.example.demo.service.LivraisonService;
@Service
public class LivraisonServiceImpl implements LivraisonService {

private LivraisonRepository livraisonRepository;

	

	@Override
	public LivraisonDTO addOneLivraison(LivraisonDTO evalution) {
		return LivraisonMapper.convertToDto(livraisonRepository.save(LivraisonMapper.convertToEntity(evalution)));

	}

	@Override
	public void deleteOneLivraison(long id) {
		livraisonRepository.deleteById(id);
	
	}

	public Page<LivraisonDTO> getAllLivraison(org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<LivraisonDTO> getAllLivraisons(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<LivraisonDTO> findOneLivraison(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	


}
