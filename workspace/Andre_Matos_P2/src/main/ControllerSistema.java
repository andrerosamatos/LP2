package main;

import java.util.ArrayList;

public class ControllerSistema {
	ArrayList<Dia> dias = new ArrayList<Dia>();
	
	
	public void addDia(Dia dia) {
		dias.add(dia);
	}
	
	public void criaRefeicao(String nome, String horario, boolean saudavel){
		Refeicao refeicao = new Refeicao(nome, horario, saudavel);
	}
	
	public void addRefeicao(int dia, Refeicao refeicao) {
		dias.get(dia).add(refeicao);
	}
	
	public int getDia(String dia) {
		return dias.indexOf(dia);
	}
	
}
