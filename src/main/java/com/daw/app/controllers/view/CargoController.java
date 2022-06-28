/**
 * 
 */
package com.daw.app.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/cargos")
public class CargoController {
	
	@GetMapping(path = {"/index","/listado","/"})
	public String listado() {
		return "cargos/listado";
	}
}
