import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Andre Rosa Matos - 116110214
 */
public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacao;
		float valor1;
		float valor2;
		float resultado;
		operacao = sc.nextLine();
		if (!operacao.equalsIgnoreCase("+")  && !operacao.equalsIgnoreCase("-") && !operacao.equalsIgnoreCase("*") && !operacao.equalsIgnoreCase("/")){
			System.out.println("ENTRADA INVALIDA");
			
		}else{
			valor1 = sc.nextFloat();
			valor2 =sc.nextFloat();
			switch(operacao){
				case "+":
				resultado = valor1 + valor2;
				System.out.println("RESULTADO: " + resultado);
				break;
			
			case "-":
				resultado = valor1 - valor2;
				System.out.println("RESULTADO: " + resultado);
				break;
				
			case "*":
				resultado = valor1 * valor2;
				System.out.println("RESULTADO: " + resultado);
				break;
				
			case "/":
				if (valor2 == 0.0){
					System.out.println("ERRO");
					break;
				}else{
					resultado = valor1 / valor2;
					System.out.println("RESULTADO: " + resultado);
				break;
				}
				
			}
		}
	}
}
	
