package entities;


public abstract class Conta {
	
	private double saldo;
	private int numero;
	private int agencia;
	private static int total = 0;
	
	public Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
		Conta.total++;
	}
		
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public static int getTotal() {
		return Conta.total;
	}

	
	public boolean depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}
	public boolean sacar(double valor) {
		if(valor <= this.getSaldo()) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	public boolean transferir(double valor, Conta conta) {
		if(valor <= this.getSaldo()) {
			conta.depositar(valor);
			this.sacar(valor);
			return true;
		}
		return false;
	}

	
	
	
	
	
	

}
