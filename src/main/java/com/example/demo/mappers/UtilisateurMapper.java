package com.example.demo.mappers;
import org.modelmapper.ModelMapper;

import com.example.demo.dto.UtilisateurDTO;
import com.example.demo.model.Utilisateur;


public class UtilisateurMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static UtilisateurDTO convertToDto(Utilisateur utilisateur)
	{
		return modelMapper.map(utilisateur, UtilisateurDTO.class);
	}
	public static Utilisateur convertToEntity(UtilisateurDTO utilisateurDTO)
	{
		return modelMapper.map(utilisateurDTO, Utilisateur.class);
	}
}
