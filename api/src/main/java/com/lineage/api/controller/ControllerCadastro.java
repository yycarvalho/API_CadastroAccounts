package com.lineage.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lineage.api.cadastro.Cadastrar;
import com.lineage.api.cadastro.DadosDeCadastro;
import com.lineage.api.cadastro.LineageCadastroRepository;
import com.lineage.api.cadastro.VerificarCadastro;
import com.lineage.api.cadastro.VerificarEmail;


@RestController

@RequestMapping("LineageCadastro")
public class ControllerCadastro {

	@Autowired
	private LineageCadastroRepository respository;
	@Autowired
	private VerificarCadastro isExistLogin;
	@Autowired
	private VerificarEmail isExistEmail;

	@PostMapping
	@Transactional
	public String cadastro(@RequestBody @Validated DadosDeCadastro dados) {
		if(!dados.pwd().equals(dados.rpwd()))
			return "Response: Password must be same";
		
		if(isExistLogin.existsByLogin(dados.login()))
			return "Response: This login has already been registered";

		if(isExistEmail.existsByEmail(dados.email()))
			return "Response: This email has already been used";
		respository.save(new Cadastrar(dados.login(),dados.pwd(),dados.email()));
		return "Response: Registration Completed";
	}
}
