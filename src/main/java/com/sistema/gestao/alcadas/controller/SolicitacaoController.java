package com.sistema.gestao.alcadas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.gestao.alcadas.model.Solicitacao;
import com.sistema.gestao.alcadas.repository.SolicitacaoRepository;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoRepository solicitacaoRepository;
	
	@GetMapping
	public List<Solicitacao> listar() {
		return solicitacaoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Solicitacao adicionar(@RequestBody Solicitacao solicitacao) {
		return solicitacaoRepository.save(solicitacao);
	}

}
