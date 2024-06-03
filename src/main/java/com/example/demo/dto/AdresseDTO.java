package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class AdresseDTO {
	 @NotBlank
	private String ville;
	 @NotBlank
	private String codepostal;
}
