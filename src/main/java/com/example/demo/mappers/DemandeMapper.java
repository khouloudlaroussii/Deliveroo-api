package com.example.demo.mappers;

import com.example.demo.dto.DemandeDTO;
import com.example.demo.model.Demande;
import org.modelmapper.ModelMapper;

public class DemandeMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static DemandeDTO convertToDto(Demande demande)
	{
		return modelMapper.map(demande, DemandeDTO.class);
	}
	public static Demande convertToEntity(DemandeDTO demandeDTO)
	{
		return modelMapper.map(demandeDTO, Demande.class);
	}
}