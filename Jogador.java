package com.matheus.exercicio.oo2;

public class Jogador {
	
	private String nome;
	private Clube time;
	private String posicao;
	
	public Jogador(String nome, String posicao) {
		this.nome = nome;
		this.setPosicao(posicao);
	}

	public void imprime() {
		
		System.out.println(this.nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Clube getTime() {
		return time;
	}


	public void setTime(Clube time) {
		this.time = time;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
}
