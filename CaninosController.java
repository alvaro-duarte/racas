package br.unigoias.racas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unigoias.racas.model.Canino;
import br.unigoias.racas.service.CaninoService;


@RestController
@RequestMapping("/caninos")
public class CaninosController {
	
	@Autowired
	private CaninoService caninoService;
	
	@GetMapping
	public List<Canino> findAll(){
		
		return caninoService.findAll();
	}
}
