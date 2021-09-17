package desafioDoJantar;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Paulo", 70);
		Comida feijao = new Comida("feijão", 0.300);
		Comida arroz = new Comida("arroz", 0.150);
		
		System.out.println(p1.peso);
		
		p1.comer(feijao);
		p1.comer(arroz);
		
		System.out.println(p1.peso);
		
		p1.comerDuranteSemana(feijao);
		p1.comerDuranteSemana(arroz);
		
		System.out.printf("%.2f\n", p1.peso);
		
	}
}
