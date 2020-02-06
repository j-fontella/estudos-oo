package entities;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
		this.depositar(100);
	}
	
	@Override
	public boolean sacar(double valor) {
		super.sacar(5);
		return super.sacar(valor);
		
	}

}
