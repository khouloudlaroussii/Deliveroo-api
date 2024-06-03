package com.example.demo.mappers;

import com.example.demo.dto.ReclamationDTO;
import com.example.demo.model.Reclamation;
import org.modelmapper.ModelMapper;

public class ReclamationMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static ReclamationDTO convertToDto(Reclamation reclamation)
	{
		return modelMapper.map(reclamation, ReclamationDTO.class);
	}
	public static Reclamation convertToEntity(ReclamationDTO reclamationDTO)
	{
		return modelMapper.map(reclamationDTO, Reclamation.class);
	}
}
