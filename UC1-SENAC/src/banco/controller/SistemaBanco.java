package banco.controller;

import banco.model.dados.Cliente;
import banco.model.dados.Conta;
import banco.model.funcionarios.*;

public class SistemaBanco {
	public static void main(String[] args) {
		Conta conta1 = new Conta("Leonardo", 1, 1, 1000, 100);

		System.out.println(conta1.getSaldo());

		conta1.sacar(2060);

		System.out.println(conta1.getSaldo());

		conta1.sacar(50);

		// O modificador static faz com que o numero de contas seja um atributo de
		// classe
		// Logo getNumeroDeContas() � acessado por classe
		System.out.println(Conta.getNumeroDeContas());
		Conta conta2 = new Conta("Leonardo", 1, 1, 2000, 100);
		System.out.println(Conta.getNumeroDeContas());

		// Criando gerente
		Gerente gerente1 = new Gerente("Fabio", "Silva", 123456789, 1000, "Senha123");

		// Como gerente � UM fucnion�rio ele tamb�m tem o m�todo getNomeCompleto
		System.out.println(gerente1.getNomeCompleto());
		// E tamb�m tem os m�todos s� de gerente
		System.out.println(gerente1.validaAcesso("OutraSenha321"));
		// Entretanto n�o consigo acessar diretamente os atributos de funcion�rio
		// System.out.println(gerente1.cpf);

		/*
		 * Criando um funcion�rio para testar se ele tem os /atributos e m�todos do
		 * gerente
		 */
		Funcionario funcionario1 = new Funcionario("Maria", "Rocha", 987654321, 1000);
		// System.out.println(funcionario1.numeroDeSubordinados);
		// System.out.println(funcionario1.validaAcesso("Senha123"));

		// Bonifica��es de fim de ano dos funcion�rios
		System.out.printf("A bonifica��o do funcion�rio �: %.2f \n", funcionario1.getBonificacao());
		System.out.printf("A bonifica��o do gerente �: %.2f \n", gerente1.getBonificacao());

		/*
		 * Com o uso do this() posso criar um objeto para cliente com CPF e outro que
		 * esqueceu o CPF.
		 */
		Cliente cliente1 = new Cliente("Pedro", "Santos", 123456789);
		System.out.printf("Nome:%s CPF: %d \n", cliente1.getNomeCompleto(), cliente1.getCpf());

		Cliente cliente2 = new Cliente("Bia", "Lima");
		System.out.printf("Nome:%s CPF: %d \n", cliente2.getNomeCompleto(), cliente2.getCpf());

		// Bia trouxe o CPF
		cliente2.setCpf(123123123);
		System.out.printf("Nome:%s CPF: %d \n", cliente2.getNomeCompleto(), cliente2.getCpf());

		// Vamos testar se conseguimos o valor de bonificacoes gastas
		ControleFinanceiro objetoControleF = new ControleFinanceiro();
		objetoControleF.registraBonificacoes(funcionario1);
		// Veja agora que n�o vamos utilizar um objeto do tipo funcion�rio
		// Isso � uma das aplica��es de polimorfismo
		objetoControleF.registraBonificacoes(gerente1);

		System.out.printf("O total gasto em bonificacoes �: %.2f \n", 
				objetoControleF.getTotalDeBonificacoes());
		
		Diretor diretor1 = new Diretor(null, null, 0, 1000, null);
		objetoControleF.registraBonificacoes(diretor1);
		
		
		System.out.printf("A bonifica��o do diretor �: %.2f \n", diretor1.getBonificacao());
		
		System.out.printf("O total gasto em bonificacoes �: %.2f \n", 
				objetoControleF.getTotalDeBonificacoes());
		
		
		objetoControleF.registraSalarios(funcionario1);
		objetoControleF.registraSalarios(gerente1);
		objetoControleF.registraSalarios(diretor1);
		
		
		System.out.printf("O total gasto em sal�rios �: %.2f \n", 
				objetoControleF.getTotalDeSalarios());
		
	}
}
