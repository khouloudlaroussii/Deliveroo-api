package com.example.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AdresseDTO;
import com.example.demo.mappers.AdresseMapper;
import com.example.demo.model.Adresse;
import com.example.demo.repository.AdresseRepository;
import com.example.demo.service.AdressService;
@Service
public class AdresseServiceImpl implements AdressService {
private AdresseRepository adresseRepository;

	

	@Override
	public AdresseDTO addOneAdresse(AdresseDTO adresses) {
		return AdresseMapper.convertToDto(adresseRepository.save(AdresseMapper.convertToEntity(adresses)));

	}

	@Override
	public void deleteOneAdresse(long id) {
		adresseRepository.deleteById(id);
	
	}

	@Override
	public Page<AdresseDTO> getAllAdresse(Pageable pageable) {
		Page<Adresse> evaluations=adresseRepository.findAll(pageable);
		return evaluations.map(AdresseMapper::convertToDto);
	}





	

}
