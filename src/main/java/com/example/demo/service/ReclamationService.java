package com.example.demo.service;

import java.awt.print.Pageable;
import org.springframework.data.domain.Page;
import com.example.demo.dto.ReclamationDTO;




public interface ReclamationService {
	public Page<ReclamationDTO> getAllReclamation(org.springframework.data.domain.Pageable pageable);
	public ReclamationDTO  addOneReclamation(ReclamationDTO reclamation);
	public void deleteOneReclamation(long id);


}
