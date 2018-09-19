import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Andre Rosa Matos - 116110214
 */

public class MaiorQMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valores;
		valores = sc.nextLine();
		double soma = 0;
		String[] numeros = valores.split(" ");
		int[] listaInt = new int[numeros.length];
		for (int i = 0; i < listaInt.length; i++) {
			listaInt[i] = Integer.parseInt(numeros[i]);
			
		}
		for (int i = 0; i < listaInt.length; i++) {
			soma += listaInt[i];
		}
		double media = soma / numeros.length;
		
		for (int i = 0; i < numeros.length; i++) {
			if (Integer.parseInt(numeros[i]) > media) {
				System.out.print(numeros[i] + ' ');
				
			}
		}
	}

}
