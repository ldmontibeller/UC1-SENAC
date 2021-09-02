package classes;

public class CoisasRedondas {
	//atributos
	/*pi é um atributo que faz sentido ser static pois 
	 * é comum a todos os métodos da classe.*/
	static double  pi = 3.14;
	double raio;
	
	//construtor
	CoisasRedondas(double raioInserido){
		raio = raioInserido;
	}
	
	//métodos
	double perimetroCircunferencia() {
		return 2 * pi * raio;
	}
	
	double areaCirculo() {
		//return pi * raio * raio; 
		//Utilizamos um atributo e um método estático da classe Math
		//Essa classe possui quase todos os seus membros como static
		return Math.PI * Math.pow(raio, 2);
	}
	
	double volumeEsfera() {
		/*Cuidado com a divisão de números em java. Se não colocarmos o ponto
		 * o compilador entende como uma operação entre inteiros, logo o resultado
		 * seria um inteiro na divisão de 4/3*/
		return 4.0/3 * pi * raio * raio * raio;
	}
}






