package com.marciamadruga.notasescolares.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SistemaNotasController {

	@RequestMapping("/cadastrarNotas")
	public String form() {
		return "sistemasnotas/formNotas";
	}
}
