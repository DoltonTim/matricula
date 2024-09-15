package pe.edu.upeu.lp2g2_clase01.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.lp2g2_clase01.entity.Genero;
import pe.edu.upeu.lp2g2_clase01.service.GeneroService;



@RestController
@RequestMapping("/api/Generos")
public class GeneroController {
	@Autowired
	private GeneroService GeneroService;
	
	@GetMapping
	public ResponseEntity<List<Genero>> readAll(){
		try {
			List<Genero> Genero = GeneroService.readAll();
			if(Genero.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Genero, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Genero> crear(@Valid @RequestBody Genero cat){
		try {
			Genero c = GeneroService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Genero> getGeneroId(@PathVariable("id") Long id){
		try {
			Genero c = GeneroService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Genero> delGenero(@PathVariable("id") Long id){
		try {
			GeneroService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}		
	@PutMapping("/{id}")
	public ResponseEntity<?> updateGenero(@PathVariable("id") Long id, @Valid @RequestBody Genero cat){

			Optional<Genero> c = GeneroService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(GeneroService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}
