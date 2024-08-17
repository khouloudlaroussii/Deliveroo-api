package com.example.demo.mappers;

import com.example.demo.dto.PickupDTO;
import com.example.demo.model.Pickup;
import org.modelmapper.ModelMapper;

public class PickupMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static PickupDTO convertToDto(Pickup pickup)
	{
		return modelMapper.map(pickup, PickupDTO.class);
	}
	public static Pickup convertToEntity(PickupDTO pickupDTO)
	{
		return modelMapper.map(pickupDTO, Pickup.class);
	}
}