package com.matheus.exercicio.oo2;

public class Clube {

	private String nome;
	private Liga liga;
	private Jogador[] jogadores;
	
	public Clube(String nome) {
		this.nome = nome;
	}

	public void imprime() {
		
		System.out.println(this.nome);
		/* for (Jogador jogador : jogadores) {
			System.out.println(Jogador.getNome());
		} */
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	public Jogador[] getJogador() {
		return jogadores;
	}

	public void setJogador(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
}