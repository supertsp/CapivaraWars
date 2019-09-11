package br.com.CapivaraWars.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.CapivaraWars.core.Jogador;

public class Credencial {
	
	@JsonProperty
	private String usuario;
	
	@JsonProperty
	private String senha;
	
	public Credencial() {
		
	}
	
	public Credencial(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean equals(Object outraCredendial) {
		return	outraCredendial instanceof Jogador &&
				((Jogador)outraCredendial).getUsuario().equals(getUsuario()) &&
				((Jogador)outraCredendial).getSenha().equals(getSenha());
	}
	
}
