package banco.funcionarios;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private long cpf;
	private double salario;
	
	public Funcionario(String nome, String sobrenome, long cpf, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public long getCpf() {
		return cpf;
	}
	
	public String getNomeESobrenome() {
		return nome+" "+sobrenome;
	}
	
	
	
}
