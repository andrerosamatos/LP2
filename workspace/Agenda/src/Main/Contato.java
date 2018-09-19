package Main;

public class Contato {

	
	public String nome;
	public String sobrenome;
	public String telefone;

	public Contato(String nome, String sobrenome, String telefone)
			throws Exception {
		if (nome == null || nome.equals("")) {
			throw new Exception("Nome nulo ou vazio.");
		}
		if (sobrenome == null || sobrenome.equals("")) {
			throw new Exception("Sobrenome nulo ou vazio.");
		}
		if (telefone == null || telefone.equals("")) {
			throw new Exception("Telefone nulo ou vazio.");
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;

	}

	@Override
	public String toString() {
		return nome + " " + sobrenome + " - " + telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

}
