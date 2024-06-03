package com.example.demo.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class ReclamationDTO {
	 @NotBlank
	private String nom ;
    @NotBlank
	private String referance;
	
	

}
