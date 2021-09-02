package fundamentos;

public class WhileDeterminado {
	public static void main(String[] args) {
		// while é "enquanto" em inglês
		//Variável de controle do loop do while
		byte contador = 0;

		// USO ERRADO
		// Underflow de variável: transborda por baixo
		System.out.println("Underflow de variável");
		while (contador < 10) {
			System.out.println(contador);
			// contador = contador +1;
			contador--;
		}
		System.out.println(contador);

		// USO ERRADO
		contador = 11;
		System.out.println("Overflow de variável");
		// Overflow de variável: transborda por cima
		while (contador > 10) {
			System.out.println(contador);
			// contador = contador +1;
			contador++;
		}
		System.out.println(contador);

		// USO CERTO
		System.out.println("Incremento de 1 em 1");
		contador = 0;
		while (contador <= 8) {
			System.out.println(contador);
			contador++;
		}

		// USO CERTO
		System.out.println("Incremento de 4 em 4");
		contador = 0;
		while (contador <= 8) {
			System.out.println(contador);
			contador+=4;
		}
	}
}
