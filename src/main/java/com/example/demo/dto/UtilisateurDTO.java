package com.example.demo.dto;

import com.example.demo.model.Grade;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class UtilisateurDTO {
	@NotBlank
	private String nom ;
	@NotBlank
	private String prenom;
	@NotBlank
	private String age ; 
    @Email
	private String email ;
	@NotBlank
	private String mdp ;
	@NotBlank
	private Grade grade;

}
