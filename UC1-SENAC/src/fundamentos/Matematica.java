package fundamentos;

public class Matematica {
	public static void main(String[] args) {
		// OPERADORES ARITIM�TICOS
		// + - * / %
		int numero = 3;
		System.out.println( numero * numero * numero);
		
		
		
		System.out.println(Math.random() * numero);
		
		System.out.println(Math.pow(numero, 5));
		
		System.out.println(Math.round(2.69));
		//O m�todo round ele retorna um tipo long
		// (int) � um CAST pra inteiro - cast � convers�o
		int numeroArredondado = (int) Math.round(3_000_000.157);
		System.out.println(numeroArredondado);
	}
}
