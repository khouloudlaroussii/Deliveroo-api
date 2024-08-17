package com.example.demo.mappers;

import com.example.demo.dto.AdresseDTO;
import com.example.demo.model.Adresse;
import org.modelmapper.ModelMapper;

public class AdresseMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static AdresseDTO convertToDto(Adresse adresse)
	{
		return modelMapper.map(adresse, AdresseDTO.class);
	}
	public static Adresse convertToEntity(AdresseDTO adresseDTO)
	{
		return modelMapper.map(adresseDTO, Adresse.class);
	}
}