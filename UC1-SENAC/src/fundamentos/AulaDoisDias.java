package fundamentos;

import java.util.Scanner;

public class AulaDoisDias {
	public static void main(String[] args) {
		int primeiroDia = 0;
		int segundoDia = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro dia: ");
		primeiroDia = entrada.nextInt();

		System.out.println("Digite o segundo dia: ");
		segundoDia = entrada.nextInt();

		if (primeiroDia > 1 && primeiroDia < 7 && segundoDia > 1 && segundoDia < 7) {
			if ((primeiroDia == 3 ^ segundoDia == 5)^(primeiroDia == 5 ^ segundoDia == 3)) {
				System.out.println("Matr�cula efetivada com sucesso");
			} else {
				System.out.println("N�o pode marcar aula na ter�a e na quinta");
			}
		} else {
			System.out.println("N�o pode marcar aula no final de semana.");
		}
		
		entrada.close();
	}
}
