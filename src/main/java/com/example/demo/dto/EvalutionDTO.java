package com.example.demo.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;
@Data
public class EvalutionDTO {
	@Positive
	private String note;
	
}
