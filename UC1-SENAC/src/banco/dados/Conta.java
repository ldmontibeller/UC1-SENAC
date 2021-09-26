package banco.dados;

public class Conta {
	//Atributos
	//Conta tem um objeto da classe cliente
	//Isso � composi��o
	private Cliente titular;
	private int conta;
	private int agencia;
	private double saldo;
	private double limite;
	//um atributo para armazenar quantas contas o banco tem
	//cada cez que uma conta � criada eu aumento esse atributo
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
	
	//M�todos
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
		else {
			System.out.println("Valor n�o permitido para dep�sito.");
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
			System.out.println("Valor n�o permitido para saque.");
		}
	}
	
	//M�todos getters
	public double getSaldo() {
		//L�gica do neg�cio do banco
		//Enganar que vc tem saldo quando n�o tem
		return saldo+limite;
	}

	public static int getNumeroContas() {
		return numeroContas;
	}


	
	
	
	//M�todos setters
	//N�o faz sentido pro meu neg�cio do sistema de um banco
	//As outras partes do programa n�o devem setar o saldo
	/*public void setSaldo(double valor) {
		saldo = valor;
	}*/
	
	
}












