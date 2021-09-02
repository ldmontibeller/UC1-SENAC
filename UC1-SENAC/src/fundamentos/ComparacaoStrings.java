package fundamentos;

public class ComparacaoStrings {
	public static void main(String[] args) {
		
		//https://stackoverflow.com/questions/3052442/what-is-the-difference-between-text-and-new-stringtext
		String stringUm = new String("senac");
		String stringDois = "senac";
		
		System.out.println("senac"=="senac");
		System.out.println("senac" == stringUm);
		System.out.println("senac" == stringDois);
		System.out.println(stringUm == stringDois);
	}
}
