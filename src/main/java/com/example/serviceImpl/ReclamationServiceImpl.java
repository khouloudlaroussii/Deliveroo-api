package com.example.serviceImpl;


import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import org.springframework.data.domain.Page;

import com.example.demo.dto.ReclamationDTO;
import com.example.demo.mappers.ReclamationMapper;
import com.example.demo.model.Reclamation;
import com.example.demo.repository.ReclamationRepository;
import com.example.demo.service.ReclamationService;

@Service
public class ReclamationServiceImpl implements ReclamationService {
	private ReclamationRepository reclamationRepository;

	@Override
	public ReclamationDTO addOneReclamation(ReclamationDTO reclamation) {
		return ReclamationMapper
				.convertToDto(reclamationRepository.save(ReclamationMapper.convertToEntity(reclamation)));

	}

	@Override
	public void deleteOneReclamation(long id) {
		reclamationRepository.deleteById(id);

	}

	@Override
	public Page<ReclamationDTO> getAllReclamation(Pageable pageable) {
		Page<Reclamation> reclamations = reclamationRepository.findAll(pageable);
		return reclamations.map(ReclamationMapper::convertToDto);

	}


	
}
