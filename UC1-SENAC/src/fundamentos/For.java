package fundamentos;

public class For {
	public static void main(String[] args) {
		
		//for em ingl�s � "para"
		//for(vari�vel de in�cio;condi��o de t�rmino;incremento ou decremento)
		
		for(int i = 0 ;i < 10;i++) {
			System.out.println(i);
		}
		
		
		for(int i = 9; i > 0; i--) {
			System.out.println(i);
		}
		
		//Muito �til para acessar uma estrutura
		//de dado chamada matriz 
		//FOR EM CADEIA
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				//System.out.print("[ "+i+" "+j+" ]");
			
				//Outra maneira de imprimir vari�veis
				System.out.printf("[%d %d]", i , j);
			}
			System.out.println();
		}
	}
}
