package entities;

import interfaces.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {
	
	public Diretor(String nome, int matricula, double salario) {
		super(nome, matricula, salario);
	}
	private int senha;

	@Override
	public double getBonificacao() {
		return this.getSalario();
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	@Override
	public int getSenha() {
		return senha;
	}
	

}
