package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		//ou ||, e &&, n�o !, ou exclusivo (xor) ^
		int idade = 17;
		boolean amigoDoDono = false;
		if(!(idade >= 18) && !amigoDoDono) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("n�o pode entrar");
		}
		
	}
}
