package classes;

public class ProdutoMain {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook", 3000, 0.2);
		Produto produto2 = new Produto("Celular", 1700, 0.15);
		Produto produto3 = new Produto();
		
		//Com o novo construtor nao preciso atribuir valores aos atributos
		/*
		produto1.nome = "Notebook";
		produto1.preco = 3000;
		produto1.desconto = 0.20;
		
		produto2.nome = "Celular";
		produto2.preco = 1700;
		produto2.desconto = 0.15;
		*/
		
		double precoFinal1 = produto1.precoComDesconto();
		double precoFinal2 = produto2.precoComDesconto();
		//double precoFinal3 = produto3.precoComDesconto();
		
		
		//Quando utiliza-se o printf o % � um lugar para trocar por um atributo
		//%s � trocado por uma String
		//%.2f � trocado por um n�mero de ponto flutuante (float ou double) com 2 casas
		//decimais

		System.out.printf("O pre�o final do %s � R$%.2f \n", produto1.nome, precoFinal1);
		System.out.printf("O pre�o final do %s � R$%.2f \n", produto2.nome, precoFinal2);
		//System.out.printf("O pre�o final do %s � R$%.2f \n", produto3.nome, precoFinal3);
		
		/*Nesse caso como s� temos um argumento estamos utilizando o m�todo
		 * do descontoDoGerente, veja na classe Produto.java*/
		precoFinal1 = produto1.precoComDesconto(0.3);
		
		//Perceba que o pre�o final do produto 1 mudou
		System.out.printf("O pre�o final do %s � R$%.2f \n", produto1.nome, precoFinal1);
		
		/* Nesse caso estamos utilizando um m�todo de classe
		 * Veja como n�o instanciamos um objetos e utilizamos
		 * diretamente o m�todo pela classe. Isso acontece porque
		 * colocamos o modificador static neste m�todo dentro da 
		 * classe Produto.java
		*/
		System.out.println(Produto.precoComDesconto(4000, 0.1));
		
		/* Cuidado com construtores padr�o!
		 * Objetos/inst�ncias de classes s�o atribu�dos por refer�ncia (veja
		 * a explica��o de ValorVsRefer�ncia). Como o construtor padr�o usa 
		 * como valor padr�o "null" para o atributo nome da classe Produto,
		 * ao tentarmos acessar um m�todo com esse atributo temos um erro
		 * chamado NullPointerException, muito famoso no Java. Descomente 
		 * a linha 57 com o m�todo para entender melhor. 
		 */
		//System.out.println(produto3.nome.toUpperCase());
		
		//Aqui vemos os valores padr�o de atributos
		System.out.println(produto3.nome);
		System.out.println(produto3.preco);
		System.out.println(produto3.desconto);
		
		/*Se criarmos uma vari�vel local e n�o inicializarmos ela o Java n�o o
		 * far� por n�s. Descomente as duas linhas abaixo e veja como surge um
		 * erro na linha 68.*/
		//int numero;
		//System.out.println(numero);
		
		/*Por fim outro exemplo de vari�vel local. Quando utilizamos vari�veis
		 * nos argumentos de m�todos (sim, for pode ser considerado um m�todo)
		 * essas vari�veis s� est�o vis�veis para aquele m�todo.*/
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		/*i n�o est� mais v�sivel, portanto n�o podemos acessar ele para
		 * increment�-lo na linha 79.*/
		//i++;
		
	}
}











