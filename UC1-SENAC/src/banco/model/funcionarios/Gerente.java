package banco.model.funcionarios;

public class Gerente extends Funcionario{
	 private String senhaDeAcesso;
	 private int numeroDeSubordinados;
	
	public Gerente(String nome, String sobrenome, int cpf, double salario, String senhaDeAcesso) {
		super(nome, sobrenome, cpf, salario);
		this.senhaDeAcesso = senhaDeAcesso;
	}
	
	public boolean validaAcesso(String senha) {
		if(senha.equals(senhaDeAcesso)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getNumeroDeSubordinados() {
		return numeroDeSubordinados;
	}
	
	
	@Override
	public double getBonificacao() {
		//return salario * 0.15;
		return super.getBonificacao() * 1.5;
	}
}
