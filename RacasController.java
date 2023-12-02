package br.unigoias.racas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unigoias.racas.model.Canino;
import br.unigoias.racas.model.Raca;
import br.unigoias.racas.service.RacaService;


@RestController
@RequestMapping("/racas")
public class RacasController {
	
	
	/**public RacasController(RacaService racaService) {
		this.racaService = racaService;
	}*/
	
	@Autowired
	private RacaService racaService;
	
	@GetMapping
	public List<Raca> findAll(){
		
		return racaService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Raca> findById(@PathVariable Integer id){
		
		 return racaService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Raca> deleteById(@PathVariable Integer id){
		
		 return racaService.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Raca> updateById(@PathVariable Integer id, @RequestBody Raca novaRaca){
		
		 return racaService.updateById(id, novaRaca);
		 
	}

	@PostMapping
	public ResponseEntity<Raca> save(@RequestBody Raca raca){
		return racaService.save(raca);
	}
	
	@PostMapping("{racaId}/caninos")
	public ResponseEntity<Canino> saveByRacaId(@PathVariable Integer racaId, @RequestBody Canino canino){
		return racaService.saveByRacaID(racaId, canino);
	}
	
	@GetMapping("{racaId}/caninos")
	public List<Canino> findAllByRacaId(@PathVariable Integer racaId){
		return racaService.findAllByRacaId(racaId);
	}
	
	
}
