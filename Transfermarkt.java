package com.matheus.exercicio.oo2;

public class Transfermarkt {

	public static void main(String[] args) {
		Liga liga1 = new Liga("La liga");
		Liga liga2 = new Liga("Premier League");
		Clube time1 = new Clube("Barcelona");
		Clube time2 = new Clube("Real Madrid");
		Clube time3 = new Clube("Manchester City");
		Jogador jogador1 = new Jogador("Lionel Messi", Posicao.getMei());
		Jogador jogador2 = new Jogador("Luis Suarez", Posicao.getAta());
		Jogador jogador3 = new Jogador("Neymar Jr", Posicao.getPe());
		Jogador jogador4 = new Jogador("Cristiano Ronaldo", Posicao.getPe());
		Jogador jogador5 = new Jogador("Karim Benzema", Posicao.getAta());
		Jogador jogador6 = new Jogador("Gareth Bale", Posicao.getPd());
		Jogador jogador7 = new Jogador("Erling Haaland", Posicao.getAta());
		Jogador jogador8 = new Jogador("Kevin De Bruyne", Posicao.getMei());
		
		Clube[] laLiga = {time1, time2};
		Clube[] premier = {time3};
		Jogador[] barcelona = {jogador1, jogador2, jogador3};
		Jogador[] realMadrid = {jogador4, jogador5, jogador6};
		Jogador[] manchester = {jogador7, jogador8};
		
	
		liga1.setClubes(laLiga);
		liga2.setClubes(premier);
		time1.setLiga(liga1);
		time2.setLiga(liga1);
		time3.setLiga(liga2);
		time1.setJogador(barcelona);
		time2.setJogador(realMadrid);
		time3.setJogador(manchester);
		for (Jogador jogador: barcelona) {
			jogador.setTime(time1);
		}
		for (Jogador jogador: realMadrid) {
			jogador.setTime(time2);
		}
		for (Jogador jogador: manchester) {
			jogador.setTime(time3);
		}
		
		liga1.imprime();
		liga2.imprime();
	}
}