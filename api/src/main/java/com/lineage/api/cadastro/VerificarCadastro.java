package com.lineage.api.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificarCadastro extends JpaRepository<Cadastrar, String> {
  boolean existsByLogin(String login);
}
