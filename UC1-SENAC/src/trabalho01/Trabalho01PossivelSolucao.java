package trabalho01;

import java.util.Scanner;

public class Trabalho01PossivelSolucao {
public static void main(String[] args) {
		
		//Declaração de Variaveis:
		double numero = 0;
		int contadorNota = 0; //INICIALIZEI O CONTADOR EM ZERO
		//ISSO RESOLVE O PROBLEMA DE TER UMA NOTA A MAIS NO CONTADOR
		double somaTotal = 0.0;
		double media = 0.0;
		
		//Abertura do Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Porta de entrada do programa:
		
		System.out.println("Bem vindo ao programa de calular média!");
		
		//O loop do while vai repetir ENQUANTO o número é DIFERENTE de -1
		while(numero != -1) {
			//veja que aqui precisei ajustar para mostrar como nota 1
			System.out.println("Digite a nota " + (contadorNota + 1) + " ou digite -1 para sair:");
			numero = entrada.nextDouble();
			//Precisamos testar se o número digitado é válido
			//Para ser válido precisa ser >= 0 e <= 10
			//Repare que eu utilizei abaixo o operador lógico && (e), ou seja, para ser verdade 
			// o número tem que ser maior que 0 E menor que 10
			//Caso tenha dúvidas pesquise sobre operadores lógicos em java
			if(numero >= 0 && numero <= 10) {//Uso de chaves para iniciar um bloco de código caso o if seja verdadeiro
				//Esta parte do código só executa se o que está dentro do if for verdadeiro
				//Ou seja, se o número digitado for válido
				//Nesse caso precisamos salvar o número a nossa soma total e incrementar o contador
				somaTotal += numero; //Pesquise sobre o operador += em Java
				contadorNota++; //Pesquise sobre operador ++ em Java
			}//essa chave fecha o bloco caso verdadeiro do if
			else { //Agora executamos outro bloco de código SENÃO for verdade o que está dentro do if
				//Não ser verdade significa que não é um número válido
				System.out.println("Nota inválida.");
			}//essa chave fecha o bloco SENãO for verdadeiro do if
		}//essa chave fecha tudo que vai ficar repetindo dentro do while
		
		//A partir daqui as coisas ocorrem depois que o while já acabou
		media = somaTotal/contadorNota;
		
		System.out.println("Foram inseridas "+contadorNota+" notas.");
		System.out.println("A média das notas é: ");
		//Para formatar a nota em duas casas após a vírgula temos que usar
		//o método String.format da maneira abaixo
		System.out.println(String.format("%.2f", media));
		//Isso já e algo mais avançado mas resumindo:
		//% é o símbolo para indicar que algo dentro de uma string entre aspas deve ser trocado por outra coisa
		//.2 é a quantidade de casa decimais
		//f é a letra para um número com vírgula, que é chamado de ponto flutuante, por isso f
		//após a vírgula vai a variável que quer trocar
		System.out.println("Obrigado por utilizar o programa!");
		// CORREÇÃO! GOSTARIA QUE A MEDIA SEJA EXIBIDA SOMENTE COM DOIS DIGITOS EX: 5,3 NÃO 5,33333
		
		entrada.close();
	}
}


