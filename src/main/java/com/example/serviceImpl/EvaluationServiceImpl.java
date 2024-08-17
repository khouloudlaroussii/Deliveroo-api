package com.example.serviceImpl;


import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EvaluationDTO;
import com.example.demo.mappers.EvaluationMapper;
import com.example.demo.repository.EvaluationRepository;
import com.example.demo.service.EvaluationService;
@Service
public class EvaluationServiceImpl implements EvaluationService {

private EvaluationRepository evaluationRepository;

	

	@Override
	public EvaluationDTO addOneEvaluation(EvaluationDTO evalution) {
		return EvaluationMapper.convertToDto(evaluationRepository.save(EvaluationMapper.convertToEntity(evalution)));

	}

	@Override
	public void deleteOneEvaluation(long id) {
		evaluationRepository.deleteById(id);
	
	}

	@Override
	public Page<EvaluationDTO> getAllEvaluation(org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
