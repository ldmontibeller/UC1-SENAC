package fundamentos;

import java.util.Scanner;

public class ParticularidadeNext {
	public static void main(String[] args) {
		System.out.println("Digite sua idade:");
		/*
		 * Aqui a gente liga o scanner pra detectar o que se é digitado no teclado. E
		 * isso é muito legal. O nome desse scanner é entrada
		 */
		Scanner entrada = new Scanner(System.in);

		/*
		 * A gente atribui o próximo valor inteiro do nosso scanner entrada dentro de
		 * uma variável do tipo inteiro.
		 */
		int idade = entrada.nextInt();

		System.out.println("Agora digite a sua altura:");
		double altura = entrada.nextDouble();

		System.out.println("Digite o seu nome:");
		/*
		 * O método next ele deleta todos os espaços e caracteres não imprimíveis antes
		 * e após um texto para ficar no formato válido. Todos os next desconsideram
		 * essas coisas, exceto o nextLine();
		 */
		String nome = entrada.next();

		System.out.println("Digite seu sobrenome");
		String sobrenome = entrada.next();

		System.out.println(nome + " " + sobrenome + " Idade:" + idade + " Altura: " + altura);

		// Desliga o meu scanner
		entrada.close();
	}
}
