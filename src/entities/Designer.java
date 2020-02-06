package entities;

public class Designer extends Funcionario {

	public Designer(String nome, int matricula, double salario) {
		super(nome, matricula, salario);
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.1;
	}

}
