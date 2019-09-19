package com.reobotnet.comercialapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reobotnet.comercialapi.model.Oportunidade;
import com.reobotnet.comercialapi.repository.OportunidadeRepository;

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {
	
	@Autowired
	private OportunidadeRepository oportunidadeRepository;
	
	@GetMapping
	public List<Oportunidade> Listar() {
		return oportunidadeRepository.findAll();
	}

}
