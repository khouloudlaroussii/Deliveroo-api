package com.example.serviceImpl;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PickupDTO;
import com.example.demo.mappers.PickupMapper;
import com.example.demo.model.Pickup;
import com.example.demo.repository.PickupRepository;
import com.example.demo.service.PickupService;
@Service
public class PickupServiceImpl implements PickupService {

private PickupRepository pickupRepository;

	

	@Override
	public PickupDTO addOnePickup(PickupDTO pickup) {
		return PickupMapper.convertToDto(pickupRepository.save(PickupMapper.convertToEntity(pickup)));

	}

	@Override
	public void deleteOnePickup(long id) {
		pickupRepository.deleteById(id);
	
	}

	@Override
	public Page<PickupDTO> getAllPickup(Pageable pageable) {
		Page<Pickup> users=pickupRepository.findAll(pageable);
		return users.map(PickupMapper::convertToDto);
	}

	

	}

	

