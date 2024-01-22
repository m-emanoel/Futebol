package com.matheus.exercicio.oo2;

public class Liga {

	private String nome;
	private Clube[] clubes;
	
	public void imprime() {
		
		System.out.println("---------------");
		System.out.println(this.nome);
		/* for (Clube time : clubes) {
			System.out.println(Clube.getNome());
		} */
	}
	
	public Liga(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Clube[] getClubes() {
		return clubes;
	}

	public void setClubes(Clube[] clubes) {
		this.clubes = clubes;
	}
}
