package banco.funcionarios;

public class Gerente extends Funcionario {
	private int numeroDeSubordinados;
	private String senha;
	
	public Gerente(String nome, 
				String sobrenome, 
				long cpf,
				double salario, 
				int numeroDeSubordinados,
				String senha) 
	{
		super(nome, sobrenome, cpf, salario);
		this.numeroDeSubordinados = numeroDeSubordinados;
		this.senha = senha;
	}

	public int getNumeroDeSubordinados() {
		return numeroDeSubordinados;
	}

	public void setNumeroDeSubordinados(int numeroDeSubordinados) {
		this.numeroDeSubordinados = numeroDeSubordinados;
	}

	public boolean valida(String senha) {
		if(senha.equals(this.senha)) {
			return true;
		}else {
			return false;
		}
	}
}











