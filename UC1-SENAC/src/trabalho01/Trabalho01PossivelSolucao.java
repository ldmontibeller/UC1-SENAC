package trabalho01;

import java.util.Scanner;

public class Trabalho01PossivelSolucao {
public static void main(String[] args) {
		
		//Declara��o de Variaveis:
		double numero = 0;
		int contadorNota = 0; //INICIALIZEI O CONTADOR EM ZERO
		//ISSO RESOLVE O PROBLEMA DE TER UMA NOTA A MAIS NO CONTADOR
		double somaTotal = 0.0;
		double media = 0.0;
		
		//Abertura do Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Porta de entrada do programa:
		
		System.out.println("Bem vindo ao programa de calular m�dia!");
		
		//O loop do while vai repetir ENQUANTO o n�mero � DIFERENTE de -1
		while(numero != -1) {
			//veja que aqui precisei ajustar para mostrar como nota 1
			System.out.println("Digite a nota " + (contadorNota + 1) + " ou digite -1 para sair:");
			numero = entrada.nextDouble();
			//Precisamos testar se o n�mero digitado � v�lido
			//Para ser v�lido precisa ser >= 0 e <= 10
			//Repare que eu utilizei abaixo o operador l�gico && (e), ou seja, para ser verdade 
			// o n�mero tem que ser maior que 0 E menor que 10
			//Caso tenha d�vidas pesquise sobre operadores l�gicos em java
			if(numero >= 0 && numero <= 10) {//Uso de chaves para iniciar um bloco de c�digo caso o if seja verdadeiro
				//Esta parte do c�digo s� executa se o que est� dentro do if for verdadeiro
				//Ou seja, se o n�mero digitado for v�lido
				//Nesse caso precisamos salvar o n�mero a nossa soma total e incrementar o contador
				somaTotal += numero; //Pesquise sobre o operador += em Java
				contadorNota++; //Pesquise sobre operador ++ em Java
			}//essa chave fecha o bloco caso verdadeiro do if
			else { //Agora executamos outro bloco de c�digo SEN�O for verdade o que est� dentro do if
				//N�o ser verdade significa que n�o � um n�mero v�lido
				System.out.println("Nota inv�lida.");
			}//essa chave fecha o bloco SEN�O for verdadeiro do if
		}//essa chave fecha tudo que vai ficar repetindo dentro do while
		
		//A partir daqui as coisas ocorrem depois que o while j� acabou
		media = somaTotal/contadorNota;
		
		System.out.println("Foram inseridas "+contadorNota+" notas.");
		System.out.println("A m�dia das notas �: ");
		//Para formatar a nota em duas casas ap�s a v�rgula temos que usar
		//o m�todo String.format da maneira abaixo
		System.out.println(String.format("%.2f", media));
		//Isso j� e algo mais avan�ado mas resumindo:
		//% � o s�mbolo para indicar que algo dentro de uma string entre aspas deve ser trocado por outra coisa
		//.2 � a quantidade de casa decimais
		//f � a letra para um n�mero com v�rgula, que � chamado de ponto flutuante, por isso f
		//ap�s a v�rgula vai a vari�vel que quer trocar
		System.out.println("Obrigado por utilizar o programa!");
		// CORRE��O! GOSTARIA QUE A MEDIA SEJA EXIBIDA SOMENTE COM DOIS DIGITOS EX: 5,3 N�O 5,33333
		
		entrada.close();
	}
}


