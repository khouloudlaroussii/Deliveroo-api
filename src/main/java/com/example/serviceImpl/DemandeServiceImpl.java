package com.example.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DemandeDTO;
import com.example.demo.mappers.DemandeMapper;
import com.example.demo.model.Demande;
import com.example.demo.repository.DemandeRepository;
import com.example.demo.service.DemandeService;
@Service
public class DemandeServiceImpl implements DemandeService {

private DemandeRepository demandeRepository;

	

	@Override
	public DemandeDTO addOneDemande(DemandeDTO demande) {
		return DemandeMapper.convertToDto(demandeRepository.save(DemandeMapper.convertToEntity(demande)));

	}

	@Override
	public void deleteOneDemande(long id) {
		demandeRepository.deleteById(id);
	
	}

	@Override
	public Page<DemandeDTO> getAllDemande(Pageable pageable) {
		Page<Demande> demandes=demandeRepository.findAll(pageable);
		return demandes.map(DemandeMapper::convertToDto);

	}





	
}
