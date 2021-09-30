package banco.controller;

import banco.model.funcionarios.Funcionario;

public class ControleFinanceiro {
    private double totalDeBonificacoes;
    private double totalDeSalarios;

    public void registraBonificacoes(Funcionario funcionario) {
        totalDeBonificacoes += funcionario.getBonificacao();
    }
    
    public void registraSalarios(Funcionario funcionario) {
    	totalDeSalarios += funcionario.getSalario();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }

	public double getTotalDeSalarios() {
		return totalDeSalarios;
	}
    
    
}
