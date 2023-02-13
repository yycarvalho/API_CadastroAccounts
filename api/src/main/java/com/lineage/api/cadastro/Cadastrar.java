package com.lineage.api.cadastro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="accounts")
@Entity(name="LineageCadastro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cadastrar {
	@Id
	private String login;
	private String password;
	private Long lastactive;
	private String access_level;
	private String lastip;
	private int lastserver;
	private String email;
	
	public Cadastrar()
	{
		
	}
	
	public Cadastrar(String login, String pwd, String email) {
		this.login = login;
		this.password = pwd;
		this.lastactive = null;
		this.access_level = null;
		this.lastip = "0";
		this.lastserver = 1;
		this.email = email;
	}
	
}
