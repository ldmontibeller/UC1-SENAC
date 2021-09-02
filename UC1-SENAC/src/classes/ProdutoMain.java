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
		
		
		//Quando utiliza-se o printf o % é um lugar para trocar por um atributo
		//%s é trocado por uma String
		//%.2f é trocado por um número de ponto flutuante (float ou double) com 2 casas
		//decimais

		System.out.printf("O preço final do %s é R$%.2f \n", produto1.nome, precoFinal1);
		System.out.printf("O preço final do %s é R$%.2f \n", produto2.nome, precoFinal2);
		//System.out.printf("O preço final do %s é R$%.2f \n", produto3.nome, precoFinal3);
		
		/*Nesse caso como só temos um argumento estamos utilizando o método
		 * do descontoDoGerente, veja na classe Produto.java*/
		precoFinal1 = produto1.precoComDesconto(0.3);
		
		//Perceba que o preço final do produto 1 mudou
		System.out.printf("O preço final do %s é R$%.2f \n", produto1.nome, precoFinal1);
		
		/* Nesse caso estamos utilizando um método de classe
		 * Veja como não instanciamos um objetos e utilizamos
		 * diretamente o método pela classe. Isso acontece porque
		 * colocamos o modificador static neste método dentro da 
		 * classe Produto.java
		*/
		System.out.println(Produto.precoComDesconto(4000, 0.1));
		
		/* Cuidado com construtores padrão!
		 * Objetos/instâncias de classes são atribuídos por referência (veja
		 * a explicação de ValorVsReferência). Como o construtor padrão usa 
		 * como valor padrão "null" para o atributo nome da classe Produto,
		 * ao tentarmos acessar um método com esse atributo temos um erro
		 * chamado NullPointerException, muito famoso no Java. Descomente 
		 * a linha 57 com o método para entender melhor. 
		 */
		//System.out.println(produto3.nome.toUpperCase());
		
		//Aqui vemos os valores padrão de atributos
		System.out.println(produto3.nome);
		System.out.println(produto3.preco);
		System.out.println(produto3.desconto);
		
		/*Se criarmos uma variável local e não inicializarmos ela o Java não o
		 * fará por nós. Descomente as duas linhas abaixo e veja como surge um
		 * erro na linha 68.*/
		//int numero;
		//System.out.println(numero);
		
		/*Por fim outro exemplo de variável local. Quando utilizamos variáveis
		 * nos argumentos de métodos (sim, for pode ser considerado um método)
		 * essas variáveis só estão visíveis para aquele método.*/
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		/*i não está mais vísivel, portanto não podemos acessar ele para
		 * incrementá-lo na linha 79.*/
		//i++;
		
	}
}











