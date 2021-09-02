package fundamentos;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		String texto ="";
		
		
		Scanner entrada = new Scanner(System.in);
		
		//utilizando uma string
		//equals é o equivalente a == para string
		while(!texto.equalsIgnoreCase("sair")){
			System.out.println("Digite um texto:");
			texto = entrada.nextLine();
			System.out.println(texto);	
		}
		
		
		//utilizando um inteiro
		int numero = 0;
		
		while(numero != -1){
			System.out.println("Digite um numero:");
			numero = entrada.nextInt();
			System.out.println(numero);	
		}
		
		entrada.close();
	}
}
