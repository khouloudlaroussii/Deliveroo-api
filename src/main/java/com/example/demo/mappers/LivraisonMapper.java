package com.example.demo.mappers;

import com.example.demo.dto.LivraisonDTO;
import com.example.demo.model.Livraison;
import org.modelmapper.ModelMapper;

public class LivraisonMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static LivraisonDTO convertToDto(Livraison livraison)
	{
		return modelMapper.map(livraison, LivraisonDTO.class);
	}
	public static Livraison convertToEntity(LivraisonDTO livraisonDTO)
	{
		return modelMapper.map(livraisonDTO, Livraison.class);
	}
}