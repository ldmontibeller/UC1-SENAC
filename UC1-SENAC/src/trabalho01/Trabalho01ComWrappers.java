//package fundamentos;
package trabalho01;

import java.util.Scanner;

public class Trabalho01ComWrappers {
public static void main(String[] args) {
		
		double numero = 0;
		int contadorNota = 0;
		double somaTotal = 0.0;
		double media = 0.0;
		String texto = " ";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao programa de calular média!");
		
		//loop infinito proposital
		while(true) {
			
			System.out.println("Digite a nota " + (contadorNota + 1) + " ou digite SAIR");
			texto = entrada.next();
			if(texto.equalsIgnoreCase("sair")) {
				break;
			} else {
				/*
				 * Utilizando um Wrapper para converter em double e ao mesmo tempo utlizar um
				 * método da classe String para trocar a vírgula inserida por ponto.
				 */
				numero =  Double.parseDouble(texto.replace(',', '.'));
				
				if(numero >= 0 && numero <= 10) {
					somaTotal += numero;
					contadorNota++;
				}
				else {
					System.out.println("Nota inválida.");
				}
			}
		}
		
		media = somaTotal/contadorNota;
		
		System.out.println("Foram inseridas "+contadorNota+" notas.");
		System.out.println("A média das notas é: ");

		System.out.println(String.format("%.2f", media));

		System.out.println("Obrigado por utilizar o programa!");
		
		entrada.close();
	}
}


