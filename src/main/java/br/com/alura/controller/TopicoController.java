package br.com.alura.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.dto.DetalheTopicoDTO;
import br.com.alura.dto.TopicoDTO;
import br.com.alura.form.AtualizacaoTopicoForm;
import br.com.alura.form.TopicoForm;
import br.com.alura.modelo.Topico;
import br.com.alura.repository.CursoRepository;
import br.com.alura.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping
	public List<TopicoDTO> lista(String nomeCurso) {
		if (nomeCurso == null) {
			List<Topico> topicos = topicoRepository.findAll();
			return TopicoDTO.converter(topicos);
		} else {
			List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
			return TopicoDTO.converter(topicos);
		}
		
	}
	
	@Transactional
	@PostMapping
	public ResponseEntity<TopicoDTO> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {
		Topico topico = form.converter(cursoRepository);
		topicoRepository.save(topico);
		
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new TopicoDTO(topico));
	}
	
	@GetMapping("/{id}")
	public DetalheTopicoDTO detalhar(@PathVariable Long id) {
		Topico topico = topicoRepository.getOne(id);
		
		return new DetalheTopicoDTO(topico);
	}
	
	@Transactional
	@PutMapping("/{id}")
	public ResponseEntity<TopicoDTO> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoTopicoForm form) {
		Topico topico = form.atualizar(id, topicoRepository);
		
		return ResponseEntity.ok(new TopicoDTO(topico));
	}

	@Transactional
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id) {
		topicoRepository.deleteById(id);
		
		return ResponseEntity.ok().build();
	}
}
