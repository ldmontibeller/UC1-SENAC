package classes;

public class CoisasRedondasMain {
	public static void main(String[] args) {
		CoisasRedondas rabico = new CoisasRedondas(2);
		CoisasRedondas pizza = new CoisasRedondas(20);
		CoisasRedondas bola = new CoisasRedondas(10);
		
		System.out.println("O rabicó tem comprimento:" + rabico.perimetroCircunferencia());
		System.out.printf("O rabicó tem comprimento: %.2f \n", rabico.perimetroCircunferencia());

		System.out.println("A pizza tem área:" + pizza.areaCirculo());
		System.out.printf("A pizza tem área: %.2f \n", pizza.areaCirculo());
		
		System.out.printf("A bola tem volume: %.2f \n", bola.volumeEsfera());
		
		CoisasRedondas.pi = 3.1;
		//Vai executar o que está dentro do if pq o pi agora é estático
		//experimente apagar o modificador static da classe CoisasRedondas.java
		//e tente executar esse código, o que mudou?
		if(rabico.pi == pizza.pi) {
			System.out.println("Os valores de pi são iguais.");
		}
	}
	
}
