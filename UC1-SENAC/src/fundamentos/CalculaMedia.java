package fundamentos;

//import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		// Locale.setDefault(new Locale("en", "US"));

		// Declaracao de variaveis
		double notaUm = 0.0, notaDois = 0.0, media = 0.0;
		Scanner entrada = new Scanner(System.in);

		// ENTRADA DE DADOS
		// Método para pegar os valores que o usuario digita
		System.out.println("Bem-vindo. Digite a primeira nota:");
		notaUm = entrada.nextDouble();
		// System.out.println(notaUm);
		System.out.println("Agora digite a segunda nota:");
		notaDois = entrada.nextDouble();

		// Logica para calcular a media
		media = (notaUm + notaDois) / 2;

		// Testar se o usuario foi aprovado ou reprovado
		if (notaUm > 10.0 || notaUm < 0.0) {
			System.out.println("Primeira nota inválida!");
		} else if (notaDois > 10.0 || notaDois < 0.0) {
			System.out.println("Segunda nota inválida!");
		} else if (media >= 7.0) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado");
			System.out.println("A media é " + media);
		}

		// Desligar o scanner
		entrada.close();
	}
}
