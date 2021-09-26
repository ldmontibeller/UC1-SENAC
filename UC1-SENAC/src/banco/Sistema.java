package banco;

import banco.funcionarios.*;
import banco.dados.*; //asterisco importa tudo do pacote

public class Sistema {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jose", "Silva", 12345678999L);
		Cliente cliente2 = new Cliente("Jose", "Silva", 12345678999L);
		Cliente cliente3 = new Cliente("Jose", "Silva", 12345678999L);
		Conta conta1 = new Conta(cliente1, 1, 1, 0, 1000);
		Conta conta2 = new Conta(cliente2, 0, 0, 0, 0);
		Conta conta3 = new Conta(cliente3, 0, 0, 0, 0);
		
		
		//Como ver quantas contas foram criadas?
		//Static fez com que getNumeroContas se tornasse um atributo da classe como um todo
		System.out.println(Conta.getNumeroContas());
		
		//Métodos de interface
		conta1.depositar(200);
		conta1.sacar(100);
		
		System.out.println(cliente1.getNomeESobrenome());
		
		Funcionario funcionario1 = new Funcionario("Maria", "Rocha", 12345678998L, 1000);
		
		System.out.printf("Salario de %s é %.2f \n",funcionario1.getNomeESobrenome()
				,funcionario1.getSalario());
		
		Gerente gerente1 = new Gerente("Fabio", "Silva", 12345678997L, 10000, 15, "fabio123");
		//Um gerente é um funcionário, por isso acessa os métodos de funcionário
		System.out.printf("Salario de %s é %.2f \n",gerente1.getNomeESobrenome()
				,gerente1.getSalario());
		
		System.out.println(gerente1.valida("senha"));
		System.out.println(gerente1.valida("fabio123"));
		
		
		
	}
}





