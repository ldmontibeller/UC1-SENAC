package fundamentos;

public class SwitchCaseBreak {
	public static void main(String[] args) {
		int numero = 2;
		
		switch (numero) {
		case 1:
		case 2:
			System.out.println("� o n�mero um ou dois.");
			break;
		case 3:
			System.out.println("� o n�mero tr�s.");
			break;
		default:
			System.out.println("N�o � nenhum caso");
		}
	}
}
