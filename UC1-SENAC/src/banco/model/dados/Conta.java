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
    
    //M�todos
    public void sacar(double valor) {
        if(valor > this.saldo + this.limite) {
        	System.out.println("Limite insuficiente.");
        } else {        	
        	this.saldo = this.saldo - valor; 
        }
    }
    
 
    public void depositar(double valor) {
    	if(valor <= 0) {
    		System.out.println("Valor para dep�sito inv�lido!");
    	} else {
    		this.saldo += valor;
    	}
    }
    
    
    String getTitular() {
    	return titular;
    }
    
    //ser� que se eu deixar somente este argumento, faz sentido pra minha aplica��o?
    void setTitular(String titular) {
    	this.titular = titular;
    }
    
    
    public double getSaldo() {
    	return saldo;
    }
    
    //Este m�todo n�o faz sentido com o nosso neg�cio
    /*void setSaldo(double valor) {
    	this.saldo = valor;
    }*/
    
    //Este � um m�todo que faz sentido com nosso neg�cio
    public static int getNumeroDeContas() {
    	return numeroDeContas;
    } 
}