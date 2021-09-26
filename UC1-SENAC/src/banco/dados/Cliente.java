package banco.dados;

public class Cliente {
	private String nome;
	private String sobrenome;
	private long cpf;
	
	public Cliente(String nome, String sobrenome, long cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	//Criando um getter personalizado
	public String getNomeESobrenome() {
		return nome+" "+sobrenome;
	}
	

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
	
}
