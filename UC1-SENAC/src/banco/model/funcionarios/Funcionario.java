package banco.model.funcionarios;

public class Funcionario {
	protected String nome;
	protected String sobrenome;
	protected int cpf;
	protected double salario;
	
	public Funcionario(String nome, String sobrenome, int cpf, double salario){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public String getNomeCompleto() {
		return nome+" "+sobrenome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	//getter da bonificação de um funcionário comum
	public double getBonificacao() {
		return salario * 0.2;
	}
}
