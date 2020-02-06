package entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
		this.depositar(1000);
	}

	@Override
	public boolean sacar(double valor) {
		super.sacar(5);
		return super.sacar(valor);	
	}
}
