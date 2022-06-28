
package com.daw.app.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app/auth")
public class AuthController {

	@GetMapping("/login")
	public String loginget(Model model) {
		return "auth/login";
	}
	@PostMapping("/login")
	public String login(Model model) {
		return "auth/login";
	}	
}
