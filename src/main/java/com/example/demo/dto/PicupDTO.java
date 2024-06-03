package com.example.demo.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;
@Data
public class PicupDTO {
	@Positive
	private String etat_pickup;

}
