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
import pe.edu.upeu.lp2g2_clase01.entity.Cliente;
import pe.edu.upeu.lp2g2_clase01.service.ClienteService;



@RestController
@RequestMapping("/api/Clientes")
public class ClienteController {
	@Autowired
	private ClienteService ClienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> readAll(){
		try {
			List<Cliente> Cliente = ClienteService.readAll();
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
	public ResponseEntity<Cliente> crear(@Valid @RequestBody Cliente cat){
		try {
			Cliente c = ClienteService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getClienteId(@PathVariable("id") Long id){
		try {
			Cliente c = ClienteService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> delCliente(@PathVariable("id") Long id){
		try {
			ClienteService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}		
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCliente(@PathVariable("id") Long id, @Valid @RequestBody Cliente cat){

			Optional<Cliente> c = ClienteService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(ClienteService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}
