package com.lineage.api.cadastro;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosDeCadastro(
		@NotBlank
		String login,
		@NotBlank
		String pwd,
		@NotBlank
		String rpwd,
		@NotBlank
		@Email
		String email
		) {
}
