package classes;

public class Produto {
	//ATRIBUTOS
	/*Veja que n�o foram inicializados, se n�o inicializarmos eles o java o far� com 
	 * valores padr�o.
	 */
	String nome;
	double preco;
	double desconto;
	
	//CONSTRUTORES
	/*Construtor padr�o n�o tem retorno e n�o tem argumentos.
	 * Argumento � a vari�vel  que vai dentro do parenteses do m�todo. 
	 * Retorno � o que vai na frente do m�todo. Perceba que um construtor
	 * n�o tem retorno.*/
	Produto(){
		
	}
	
	//Construtor definido pelo desenvolvedor
	//Argumentos s�o passados aos atributos da classe
	Produto(String nomeInserido, 
			double precoInserido, 
			double descontoInserido){
		nome = nomeInserido;
		preco = precoInserido;
		desconto = descontoInserido;			
	}
	
	//M�TODOS
	/*M�todo tem o tipo de retorno na frente do nome
	 * e podem ou n�o ter retorno. Se tiver, deve utilizar
	 * a palavra reservada "return"*/
	double precoComDesconto() {
		return  preco * (1 - desconto);
	}
	
	/*Perceba que o m�todo abaixo apesar de ter o mesmo nome
	 * tem uma assinatura diferente. Ou seja, uma quantidade
	 * de argumentos diferente.*/
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto - descontoDoGerente);
	}
	
	/*O m�todo abaixo faz mais sentido ter o modificador static.
	 *Faz mais sentido eu calcular um pre�o com desconto sem precisar
	 *instanciar um objeto.
	 * */
	static double precoComDesconto(double precoInserido, double descontoInserido) {
		return precoInserido * (1 - descontoInserido);
	}
	
}










