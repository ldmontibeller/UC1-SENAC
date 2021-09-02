package classes;

public class CoisasRedondas {
	//atributos
	/*pi � um atributo que faz sentido ser static pois 
	 * � comum a todos os m�todos da classe.*/
	static double  pi = 3.14;
	double raio;
	
	//construtor
	CoisasRedondas(double raioInserido){
		raio = raioInserido;
	}
	
	//m�todos
	double perimetroCircunferencia() {
		return 2 * pi * raio;
	}
	
	double areaCirculo() {
		//return pi * raio * raio; 
		//Utilizamos um atributo e um m�todo est�tico da classe Math
		//Essa classe possui quase todos os seus membros como static
		return Math.PI * Math.pow(raio, 2);
	}
	
	double volumeEsfera() {
		/*Cuidado com a divis�o de n�meros em java. Se n�o colocarmos o ponto
		 * o compilador entende como uma opera��o entre inteiros, logo o resultado
		 * seria um inteiro na divis�o de 4/3*/
		return 4.0/3 * pi * raio * raio * raio;
	}
}






