package com.example.demo.mappers;


import com.example.demo.dto.EvaluationDTO;
import com.example.demo.model.Evaluation;
import org.modelmapper.ModelMapper;

public class EvaluationMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static EvaluationDTO convertToDto(Evaluation evaluation)
	{
		return modelMapper.map(evaluation, EvaluationDTO.class);
	}
	public static Evaluation convertToEntity(EvaluationDTO evaluationDTO)
	{
		return modelMapper.map(evaluationDTO, Evaluation.class);
	}
}
