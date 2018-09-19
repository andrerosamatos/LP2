package Main;
import java.util.Scanner;

public class main {

	private static Menu menu = new Menu();
	private static Scanner sc = null;
	private static Agenda agenda = new Agenda();

	public static void main(String[] args) throws Exception {
		
		sc = new Scanner(System.in);

	
		Boolean sair = false;
		
		while (sair != true) {
			System.out.print(menu.exibeMenu());
			String opcao = sc.nextLine().toUpperCase();

			switch (opcao) {
			case "C":
				cadastrar();

				break;

			case "L":
				listar();

				break;

			case "E":
				exibir(0);

				break;

			case "S":
			 sair = true;
			 
			 break;
			 
			default:
				System.out.println("OPÇÃO INVÁLIDA!" + "\n");
			}

		}
	}		


	private static void cadastrar() throws Exception {
		System.out.print("\n" + "Posicao: ");
		int posicao = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Sobrenome: ");
		String sobrenome = sc.nextLine();
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		Contato contato = new Contato(nome, sobrenome, telefone);
		agenda.salvaContato(posicao, contato);
		System.out.println("CADASTRO REALIZADO!" + "\n");
	}

	
	private static void listar() {
		System.out.println(agenda.listarContatos());
		
	}
	
	private static void exibir(int posicao) {
		System.out.println("Posicao: ");
		posicao = sc.nextInt();
		sc.nextLine();
		agenda.exibirContato(posicao);
		System.out.println("\n");
	}
	
	
}

	




	

