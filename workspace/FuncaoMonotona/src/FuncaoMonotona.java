import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Andre Rosa Matos - 116110214
 */
public class FuncaoMonotona {

	public static void main(String[] args) {
		int[] valores = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt();
		}
		if (valores[0] < valores[1] && valores[1] < valores[2] && valores[2] < valores[3]){
			System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		}else if (valores[0] > valores[1] && valores[1] > valores[2] && valores[2] > valores[3]){
			System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		}else{
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}
	}
}
