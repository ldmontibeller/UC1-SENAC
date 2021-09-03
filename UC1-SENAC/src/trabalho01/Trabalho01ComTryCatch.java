package trabalho01;

import java.util.Scanner;

public class Trabalho01ComTryCatch {
	public static void main(String[] args) {

		// Declaração de Variaveis:
		double numero = 0;
		int contadorNota = 0;
		double somaTotal = 0.0;
		double media = 0.0;
		String textoInserido = "";
		boolean flagTextoErrado = false;

		// Abertura do Scanner
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo ao programa de calular média!");

		// Loop infinito proposital
		while (true) {

			System.out.println("Digite a " + (contadorNota + 1) + "ª nota ou digite SAIR:");
			textoInserido = entrada.next();
			if (textoInserido.equalsIgnoreCase("sair")) {
				break;
			} else {
				/* Utilizando try e catch para tratar o erro. A estratégia aqui foi adotar
				 * uma bandeira que sinaliza se o usuário digitou um texto não permitido.
				 * */
				try {
					/*
					 * Utilizando um Wrapper para converter em double e ao mesmo tempo utlizar um
					 * método da classe String para trocar a vírgula inserida por ponto.
					 */
					numero = Double.parseDouble(textoInserido.replace(",", "."));
				} catch (NumberFormatException e) {
					flagTextoErrado = true;
				}

				if (numero >= 0 && numero <= 10 && !flagTextoErrado) {
					somaTotal += numero;
					contadorNota++;
				} else {
					System.out.println("A nota inserida é inválida, tente novamente.");
				}
				
				//Lembrar de sempre manter a flag como falsa após um eventual erro.
				flagTextoErrado = false;
			}
		}

		media = somaTotal / contadorNota;

		System.out.println("Foram inseridas " + contadorNota + " notas.");
		System.out.println("A média das notas é: ");
		System.out.println(String.format("%.2f", media));
		System.out.println("Obrigado por utilizar o programa!");

		entrada.close();
	}
}
