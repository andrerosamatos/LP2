package main;

import java.util.ArrayList;

public class Dia {
	
	String dia;
	ArrayList<Refeicao> refeicoes = new ArrayList<Refeicao>();
	
	public void dia(String dia){
		if (dia.equals("")){
			throw new IllegalArgumentException("dia nao pode ser vazio");
		} else {
			this.dia = dia;
		}
	}

	public void add(Refeicao refeicao) {
		refeicoes.add(refeicao);
	}
	
	

}
