package banco.model.funcionarios;

public class Diretor extends Gerente {

	public Diretor(String nome, String sobrenome, int cpf, double salario, String senhaDeAcesso) {
		super(nome, sobrenome, cpf, salario, senhaDeAcesso);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() * 2;
	}
	
}
