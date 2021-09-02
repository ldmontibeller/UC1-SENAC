package fundamentos;

public class SwitchCaseBreak {
	public static void main(String[] args) {
		int numero = 2;
		
		switch (numero) {
		case 1:
		case 2:
			System.out.println("É o número um ou dois.");
			break;
		case 3:
			System.out.println("É o número três.");
			break;
		default:
			System.out.println("Não é nenhum caso");
		}
	}
}
