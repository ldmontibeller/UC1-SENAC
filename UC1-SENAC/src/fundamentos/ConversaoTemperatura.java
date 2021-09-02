package fundamentos;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		// (F-32)*5/9 = C
		final byte AJUSTE32 = 32;
		/*
		 * Para atribuir um valor a uma variavel do
		 * tipo double colocamos uma valor explicito em double
		 * com a casa decimal
		 */
		final double FATORDEMULTIPLICACAO = 5.0 / 9;

		System.out.println(FATORDEMULTIPLICACAO);

		double tempFarenheit = 77;
		double tempCelsius;

		tempCelsius = (tempFarenheit - AJUSTE32) * FATORDEMULTIPLICACAO;

		System.out.println(tempCelsius);
	}
}
