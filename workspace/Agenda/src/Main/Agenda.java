package Main;

public class Agenda {

	private Contato[] contatos;
	private final int INICIO_ARRAY = 0;
	private final int FIM_ARRAY = 100;

	public Agenda() {
		this.contatos = new Contato[FIM_ARRAY];
	}

	public void salvaContato(int posicao, Contato contato) {
		if (posicao > INICIO_ARRAY && posicao <= FIM_ARRAY) {
			contatos[posicao - 1] = contato;
		}

	}

	public void exibirContato(int posicao) {
		System.out.println(contatos[posicao - 1].toString());
	}

	public String listarContatos() {
		String lista = "";
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				lista += (i + 1 + " - " + contatos[i].getNome() + " "
						+ contatos[i].getSobrenome() + "\n");
			}
		}
		return lista;
	}
}
