package banco.model.dados;

public class Conta {
    //Atributos
	private String titular;
    private int numero;
    private int agencia;
    private double saldo;
    private double limite;
    private static int numeroDeContas;
 	//private Cliente titular;
    
    //Construtor
    public Conta(String titular, int numero, int agencia, double saldo, double limite){
    	this.titular = titular;
    	this.numero = numero;
    	this.agencia = agencia;
    	this.saldo = saldo;
    	this.limite = limite;
    	numeroDeContas ++;
    }
    
    //Métodos
    public void sacar(double valor) {
        if(valor > this.saldo + this.limite) {
        	System.out.println("Limite insuficiente.");
        } else {        	
        	this.saldo = this.saldo - valor; 
        }
    }
    
 
    public void depositar(double valor) {
    	if(valor <= 0) {
    		System.out.println("Valor para depósito inválido!");
    	} else {
    		this.saldo += valor;
    	}
    }
    
    
    String getTitular() {
    	return titular;
    }
    
    //será que se eu deixar somente este argumento, faz sentido pra minha aplicação?
    void setTitular(String titular) {
    	this.titular = titular;
    }
    
    
    public double getSaldo() {
    	return saldo;
    }
    
    //Este método não faz sentido com o nosso negócio
    /*void setSaldo(double valor) {
    	this.saldo = valor;
    }*/
    
    //Este é um método que faz sentido com nosso negócio
    public static int getNumeroDeContas() {
    	return numeroDeContas;
    } 
}