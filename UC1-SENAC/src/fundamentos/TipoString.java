package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		String nome = "Leonardo";
		String sobrenome = "Montibeller";
		
		
		//Concatena��o de strings
		System.out.println(nome + " " + sobrenome);
		System.out.println(nome.concat(sobrenome));
		
		//Metodo legnth d� a quantidade de caracteres de uma string
		System.out.println("abacaxi".length());
		
		System.out.println("  abacaxi");
		System.out.println("  abacaxi".trim());
		System.out.println("  abacaxi".trim().toUpperCase());
		
		System.out.println("Ol� esse � um texto"
				+ " muito comprido mesmo asdasdsadsad\n "
				+ "asdasdsadasdasdsa \n"
				+ "asdasdsadsadsadsa \n"
				+ "sadasdas \n");
		
		System.out.print("Esse � o print\n");
		System.out.print("O print � bem legal\n");
		
		
	}
}
