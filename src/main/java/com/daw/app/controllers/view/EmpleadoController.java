package com.daw.app.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/empleados")
public class EmpleadoController {

	@GetMapping("/listado")
	public String listado() {
		return "empleados/listado";
	}
}
