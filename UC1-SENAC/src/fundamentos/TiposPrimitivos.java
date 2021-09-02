package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos primitivos inteiros
		byte idadeFuncionario = 30;//MAIS UTILIZADO
		short numeroViagens = 460;
		int id = 33470;//MAIS UTILIZADO
		long milhas = 32_000_000_001L;
		
		//Tipos primitivos reais
		float salario = 6_523.57F;
		double vendas = 3_000_000_000_000.23;//MAIS UTILIZADO
		
		//Tipo primitivo l�gico
		boolean status = true;//MUITO UTILIZADA
		
		//Tipo primitivo liter�rio
		char inicial = 'L';
		
		//N�O � Tipo primitivo! � uma classe Java!
		String texto = "isso � um texto";
		
		System.out.println("Bem vindo ao sistema de cadastro");
		System.out.println(idadeFuncionario);
		System.out.println(numeroViagens);
		System.out.println(id);
		System.out.println(milhas);
		System.out.println(salario);
		System.out.println(vendas);
		System.out.println(status);
		System.out.println(inicial);
		System.out.println(texto);
	}
}
