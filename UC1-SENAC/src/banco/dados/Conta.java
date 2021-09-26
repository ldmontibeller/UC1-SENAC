package banco.dados;

public class Conta {
	//Atributos
	//Conta tem um objeto da classe cliente
	//Isso é composição
	private Cliente titular;
	private int conta;
	private int agencia;
	private double saldo;
	private double limite;
	//um atributo para armazenar quantas contas o banco tem
	//cada cez que uma conta é criada eu aumento esse atributo
	private static int numeroContas;
	
	//Construtor
	public Conta(Cliente titular, int conta, int agencia, double saldo, double limite){
		this.titular = titular;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
		numeroContas++;// ++ incrementa o atributo
	}
	
	//Métodos
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
		else {
			System.out.println("Valor não permitido para depósito.");
		}
	}
	
	public void sacar(double valor) {
		if(valor > 0) {
			if(valor <= saldo + limite) {
				saldo -= valor;
			} 
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		else {
			System.out.println("Valor não permitido para saque.");
		}
	}
	
	//Métodos getters
	public double getSaldo() {
		//Lógica do negócio do banco
		//Enganar que vc tem saldo quando não tem
		return saldo+limite;
	}

	public static int getNumeroContas() {
		return numeroContas;
	}


	
	
	
	//Métodos setters
	//Não faz sentido pro meu negócio do sistema de um banco
	//As outras partes do programa não devem setar o saldo
	/*public void setSaldo(double valor) {
		saldo = valor;
	}*/
	
	
}












