package trabalho01;

import java.util.Scanner;

public class Trabalho01ComTryCatch {
	public static void main(String[] args) {

		// Declara��o de Variaveis:
		double numero = 0;
		int contadorNota = 0;
		double somaTotal = 0.0;
		double media = 0.0;
		String textoInserido = "";
		boolean flagTextoErrado = false;

		// Abertura do Scanner
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo ao programa de calular m�dia!");

		// Loop infinito proposital
		while (true) {

			System.out.println("Digite a " + (contadorNota + 1) + "� nota ou digite SAIR:");
			textoInserido = entrada.next();
			if (textoInserido.equalsIgnoreCase("sair")) {
				break;
			} else {
				/* Utilizando try e catch para tratar o erro. A estrat�gia aqui foi adotar
				 * uma bandeira que sinaliza se o usu�rio digitou um texto n�o permitido.
				 * */
				try {
					/*
					 * Utilizando um Wrapper para converter em double e ao mesmo tempo utlizar um
					 * m�todo da classe String para trocar a v�rgula inserida por ponto.
					 */
					numero = Double.parseDouble(textoInserido.replace(",", "."));
				} catch (NumberFormatException e) {
					flagTextoErrado = true;
				}

				if (numero >= 0 && numero <= 10 && !flagTextoErrado) {
					somaTotal += numero;
					contadorNota++;
				} else {
					System.out.println("A nota inserida � inv�lida, tente novamente.");
				}
				
				//Lembrar de sempre manter a flag como falsa ap�s um eventual erro.
				flagTextoErrado = false;
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
