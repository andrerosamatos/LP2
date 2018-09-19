package sp2fy;


public class Musica {
	
	private String titulo;
	private int minutos;
	private String artista;
	private int ano;
	private String genero;
	
	public Musica(String titulo, int minutos, String artista) throws Exception{
		if(titulo == null || titulo.trim().equals(""))
			throw new Exception("Titulo nao pode ser null ou vazio.");
		if(minutos <= 0)
			throw new Exception("Minutos não podem ser negativos ou 0");
		}



}
