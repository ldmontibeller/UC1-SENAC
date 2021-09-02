package classes;

public class ValorVsReferencia {
	public static void main(String[] args) {
		/*Duas vari�veis locais s�o criadas mas a primeira
		 * � atribu�da por valor para a segunda*/
		int a = 2;
		int b = a;
		
		/*Ao mexer nessas vari�veis locais percebemos que elas funcionam
		de maneira independente pois uma c�pia do valor de a foi passado
		para b*/
		a++; //incremento de 1
		b--; //decremento de 1
		
		System.out.println(a);
		System.out.println(b);
		
		/*J� quando fizemos o mesmo com um objeto de uma classe
		 * � passado a c�pia da refer�ncia de p1 (apontador/ponteiro de endere�o)
		 * para p2 e n�o uma c�pia do valor.*/
		Produto p1 = new Produto("Banana", 2, 0.5);
		Produto p2 = p1;
		
		/*Por isso ao alterarmos o atributo nome de p1 estamos tamb�m alterando
		 * o atributo de p2 pois os dois objetos apontam para o mesmo conte�do,
		 * ou seja, t�m a mesma refer�ncia. */
		p1.nome = "mamao";
		System.out.printf("Produto: %s  custa %.2f e o desconto "
				+ "� %.2f \n", p2.nome, p2.preco, p2.desconto);
	
		System.out.println(p1.nome);
		System.out.println(p2.nome);
	}
}
