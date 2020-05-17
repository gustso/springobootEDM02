package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	
	@GetMapping("/")
	public String ingresarSistema() {
		System.out.println("holllaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return "index";
	}
	
	@GetMapping("/servicio")
	public String serviciosSistema() {
		return "servicio";
	}
}
