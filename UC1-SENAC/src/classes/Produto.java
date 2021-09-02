package classes;

public class Produto {
	//ATRIBUTOS
	/*Veja que não foram inicializados, se não inicializarmos eles o java o fará com 
	 * valores padrão.
	 */
	String nome;
	double preco;
	double desconto;
	
	//CONSTRUTORES
	/*Construtor padrão não tem retorno e não tem argumentos.
	 * Argumento é a variável  que vai dentro do parenteses do método. 
	 * Retorno é o que vai na frente do método. Perceba que um construtor
	 * não tem retorno.*/
	Produto(){
		
	}
	
	//Construtor definido pelo desenvolvedor
	//Argumentos são passados aos atributos da classe
	Produto(String nomeInserido, 
			double precoInserido, 
			double descontoInserido){
		nome = nomeInserido;
		preco = precoInserido;
		desconto = descontoInserido;			
	}
	
	//MÉTODOS
	/*Método tem o tipo de retorno na frente do nome
	 * e podem ou não ter retorno. Se tiver, deve utilizar
	 * a palavra reservada "return"*/
	double precoComDesconto() {
		return  preco * (1 - desconto);
	}
	
	/*Perceba que o método abaixo apesar de ter o mesmo nome
	 * tem uma assinatura diferente. Ou seja, uma quantidade
	 * de argumentos diferente.*/
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto - descontoDoGerente);
	}
	
	/*O método abaixo faz mais sentido ter o modificador static.
	 *Faz mais sentido eu calcular um preço com desconto sem precisar
	 *instanciar um objeto.
	 * */
	static double precoComDesconto(double precoInserido, double descontoInserido) {
		return precoInserido * (1 - descontoInserido);
	}
	
}










