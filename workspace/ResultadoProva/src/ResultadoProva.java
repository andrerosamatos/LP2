import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ResultadoProva {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String[] entrada = null;
		entrada = null;
		int total = 0;

		while (true) {
			entrada = sc.nextLine().split(" ");
			if (!entrada.equals("-")) {
				lista.add(entrada[1]);
			
			} else {
				break;
			}

		}
	}
}
