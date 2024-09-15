package pe.edu.upeu.lp2g2_clase01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping
	public String index() {
		return "Bienvenido al proyecto Dolton Tom YA LO CREEEEE";
		
	} 

}
