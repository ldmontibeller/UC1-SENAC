package trabalho01;

import java.util.Scanner;

public class Trabalho01ComWrappers {
	public static void main(String[] args) {

		// Declara��o de Variaveis:
		double numero = 0;
		int contadorNota = 0;
		double somaTotal = 0.0;
		double media = 0.0;
		String textoInserido = "";

		// Abertura do Scanner
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo ao programa de calular m�dia!");

		// Loop infito proposital
		while (true) {

			System.out.println("Digite a " + (contadorNota + 1) + "� nota ou digite SAIR:");
			textoInserido = entrada.next();
			if (textoInserido.equalsIgnoreCase("sair")) {
				break;
			} else {
				/*
				 * Utilizando um Wrapper para converter em double e ao mesmo tempo utlizar um
				 * m�todo da classe String para trocar a v�rgula inserida por ponto.
				 */
				numero = Double.parseDouble(textoInserido.replace(",", "."));
				
				if (numero >= 0 && numero <= 10) {
					somaTotal += numero;
					contadorNota++;
				} else {
					System.out.println("A nota inserida � inv�lida, tente novamente.");
				}
			}
		}

		media = somaTotal / contadorNota;

		System.out.println("Foram inseridas " + contadorNota + " notas.");
		System.out.println("A m�dia das notas �: ");
		System.out.println(String.format("%.2f", media));
		System.out.println("Obrigado por utilizar o programa!");

		entrada.close();
	}
}
