package classes;

public class ValorVsReferencia {
	public static void main(String[] args) {
		/*Duas variáveis locais são criadas mas a primeira
		 * é atribuída por valor para a segunda*/
		int a = 2;
		int b = a;
		
		/*Ao mexer nessas variáveis locais percebemos que elas funcionam
		de maneira independente pois uma cópia do valor de a foi passado
		para b*/
		a++; //incremento de 1
		b--; //decremento de 1
		
		System.out.println(a);
		System.out.println(b);
		
		/*Já quando fizemos o mesmo com um objeto de uma classe
		 * é passado a cópia da referência de p1 (apontador/ponteiro de endereço)
		 * para p2 e não uma cópia do valor.*/
		Produto p1 = new Produto("Banana", 2, 0.5);
		Produto p2 = p1;
		
		/*Por isso ao alterarmos o atributo nome de p1 estamos também alterando
		 * o atributo de p2 pois os dois objetos apontam para o mesmo conteúdo,
		 * ou seja, têm a mesma referência. */
		p1.nome = "mamao";
		System.out.printf("Produto: %s  custa %.2f e o desconto "
				+ "é %.2f \n", p2.nome, p2.preco, p2.desconto);
	
		System.out.println(p1.nome);
		System.out.println(p2.nome);
	}
}
