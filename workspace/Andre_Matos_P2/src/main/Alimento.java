package main;

public class Alimento {
	
	String nome;
	int calorias;
	int gordura;
	int carb;
	
	public Alimento(String nome, int calorias, int gordura, int carb){
		this.nome = nome;
		this.calorias = calorias;
		this.gordura = gordura;
		this.carb = carb;
	}

	@Override
	public String toString() {
		return nome + " - " + calorias + " kcal";
	}
}
