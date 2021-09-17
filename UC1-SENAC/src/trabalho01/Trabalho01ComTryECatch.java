package trabalho01;

import java.util.Scanner;

public class Trabalho01ComTryECatch {
	public static void main(String[] args) {

		// Declara��o de Variaveis:
		double numero = 0;
		int contadorNota = 0;
		double somaTotal = 0.0;
		double media = 0.0;
		String textoInserido = "";
		//flag ou bandeira
		boolean textoInseridoEstaErrado = false;

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
				/* Utilizando try e catch para tratar o erro. A estrat�gia aqui foi adotar
				 * uma bandeira que sinaliza se o usu�rio digitou um texto n�o permitido.
				 * */
				try {
					/*
					 * Utilizando um Wrapper para converter em double e ao mesmo tempo utlizar um
					 * m�todo da classe String para trocar a v�rgula inserida por ponto.
					 */
					numero = Double.parseDouble(textoInserido.replace(",", "."));
				} catch(NumberFormatException e) {
					//Levantei a bandeira do erro
					textoInseridoEstaErrado = true;
				}
				if (numero >= 0 && numero <= 10 && textoInseridoEstaErrado == false) {
					somaTotal += numero;
					contadorNota++;
				} else {
					System.out.println("A nota inserida � inv�lida, tente novamente.");
					//Baixar a bandeira do erro ap�s ter sido levantada
					textoInseridoEstaErrado = false;
				}
			}
		}

		media = somaTotal / contadorNota;

		System.out.println("Foram inseridas " + contadorNota + " notas.");
		System.out.println("A m�dia das notas �: ");
		System.out.println(String.format("%.2f", media));
		System.out.println("Obrigado por utilizar o programa!");

		entrada.close();
		//O que acontece se o usu�rio digitar outra palavra ao inv�s de sair?
	}
}
