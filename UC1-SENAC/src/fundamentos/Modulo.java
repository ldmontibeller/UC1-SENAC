package fundamentos;

import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		System.out.println("Digite um número:");
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		if(numero%3 == 0) {
			System.out.println("Multiplo de 3");
		}else {
			System.out.println("nao é multiplo de 3");
		}
		
		//System.out.println(numero);
		
		entrada.close();
		}
}
