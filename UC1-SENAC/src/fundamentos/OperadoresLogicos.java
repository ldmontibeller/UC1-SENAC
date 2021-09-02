package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		//ou ||, e &&, não !, ou exclusivo (xor) ^
		int idade = 17;
		boolean amigoDoDono = false;
		if(!(idade >= 18) && !amigoDoDono) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("não pode entrar");
		}
		
	}
}
