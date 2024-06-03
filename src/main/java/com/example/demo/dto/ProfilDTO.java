package com.example.demo.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class ProfilDTO {
	@NotBlank
	private String nom ;
	@NotBlank
	private String prenom;
	@NotBlank
	private String age ; 
    @Email
	private String email ;
	@NotBlank
	private String modp ;

	

}
