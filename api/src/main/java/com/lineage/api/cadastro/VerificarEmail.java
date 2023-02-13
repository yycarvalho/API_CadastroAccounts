package com.lineage.api.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificarEmail extends JpaRepository<Cadastrar, String> {
	  boolean existsByEmail(String email);
	}
