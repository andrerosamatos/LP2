package sp2fy;

public class Album {
	
	public Album(String artista, String album, int ano) throws Exception {
		if(artista == null || artista.trim().equals(""))
			throw new Exception("Artista nao pode ser null ou vazio.");
	}
	
}
