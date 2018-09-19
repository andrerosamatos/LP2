import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Andre Rosa Matos - 116110214
 */

public class Passou {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double nota1;
	nota1 = sc.nextDouble();
	double nota2;
	nota2 = sc.nextDouble();
	boolean passou = false;
	
	if ((nota1 + nota2)/2 >= 7.0) {
		passou = true;
		System.out.println("pass: " + "True!");
	}else{
		System.out.println("pass: " + "False!");
	}
	
	
}
}
