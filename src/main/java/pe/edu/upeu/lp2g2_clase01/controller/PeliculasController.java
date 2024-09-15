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
import pe.edu.upeu.lp2g2_clase01.entity.Peliculas;
import pe.edu.upeu.lp2g2_clase01.service.PeliculaService;




@RestController
@RequestMapping("/api/peliculas")
public class PeliculasController {
	@Autowired
	private PeliculaService PeliculaService;
	
	@GetMapping
	public ResponseEntity<List<Peliculas>> readAll(){
		try {
			List<Peliculas> Cliente = PeliculaService.readAll();
			if(Cliente.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Cliente, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Peliculas> crear(@Valid @RequestBody Peliculas cat){
		try {
			Peliculas c = PeliculaService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Peliculas> getClienteId(@PathVariable("id") Long id){
		try {
			Peliculas c = PeliculaService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Peliculas> delCliente(@PathVariable("id") Long id){
		try {
			PeliculaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}		
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCliente(@PathVariable("id") Long id, @Valid @RequestBody Peliculas cat){

			Optional<Peliculas> c = PeliculaService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(PeliculaService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}
