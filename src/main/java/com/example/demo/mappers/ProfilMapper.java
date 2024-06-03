package com.example.demo.mappers;

import com.example.demo.dto.ProfilDTO;
import com.example.demo.model.Profil;
import org.modelmapper.ModelMapper;

public class ProfilMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static ProfilDTO convertToDto(Profil profil)
	{
		return modelMapper.map(profil, ProfilDTO.class);
	}
	public static Profil convertToEntity(ProfilDTO profilDTO)
	{
		return modelMapper.map(profilDTO, Profil.class);
	}
}

