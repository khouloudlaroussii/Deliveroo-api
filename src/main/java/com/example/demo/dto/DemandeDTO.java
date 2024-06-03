package com.example.demo.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class DemandeDTO {
	 @NotBlank
	private String nom ;
	 @NotBlank
	private String referance;


}
