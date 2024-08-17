package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.demo.dto.PickupDTO;



public interface PickupService {

	
	
	
	Page<PickupDTO> getAllPickup(Pageable pageable);
	public void deleteOnePickup(long id);
	public PickupDTO addOnePickup(PickupDTO pickup);


}
