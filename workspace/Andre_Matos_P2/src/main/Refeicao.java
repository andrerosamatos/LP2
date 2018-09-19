package main;

import java.util.ArrayList;

public class Refeicao {

	String nome;
	String horario;
	boolean saudavel;
	
	ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
	
	public Refeicao(String nome, String horario, boolean saudavel) {
		this.nome = nome;
		this.horario = horario;
		this.saudavel = saudavel;	
		}
	
	public void adicionaAlimentos(String nome, int calorias, int gordura, int carb){
		Alimento alimento = new Alimento(nome, calorias, gordura, carb);
		alimentos.add(alimento);
	}
	
	
}
