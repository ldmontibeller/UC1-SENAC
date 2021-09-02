package classes;

public class CoisasRedondasMain {
	public static void main(String[] args) {
		CoisasRedondas rabico = new CoisasRedondas(2);
		CoisasRedondas pizza = new CoisasRedondas(20);
		CoisasRedondas bola = new CoisasRedondas(10);
		
		System.out.println("O rabic� tem comprimento:" + rabico.perimetroCircunferencia());
		System.out.printf("O rabic� tem comprimento: %.2f \n", rabico.perimetroCircunferencia());

		System.out.println("A pizza tem �rea:" + pizza.areaCirculo());
		System.out.printf("A pizza tem �rea: %.2f \n", pizza.areaCirculo());
		
		System.out.printf("A bola tem volume: %.2f \n", bola.volumeEsfera());
		
		CoisasRedondas.pi = 3.1;
		//Vai executar o que est� dentro do if pq o pi agora � est�tico
		//experimente apagar o modificador static da classe CoisasRedondas.java
		//e tente executar esse c�digo, o que mudou?
		if(rabico.pi == pizza.pi) {
			System.out.println("Os valores de pi s�o iguais.");
		}
	}
	
}
