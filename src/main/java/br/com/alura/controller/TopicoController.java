package br.com.alura.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.controller.dto.TopicoDTO;
import br.com.alura.modelo.Curso;
import br.com.alura.modelo.Topico;

@RestController
public class TopicoController {

	@RequestMapping("/topicos")
	public List<TopicoDTO> lista() {
		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
	}
}
