package banco.model.dados;

public class Cliente {
	private String nome;
	private String sobrenome;
	private int cpf;
	
	/*
	Cliente(String nome, String sobrenome, int cpf){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	*/
	
	public Cliente(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Cliente(String nome, String sobrenome, int cpf){
		this(nome, sobrenome);
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	
	public String getNomeCompleto() {
		return nome+" "+sobrenome;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
