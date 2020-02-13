package entities;

public class Terceirizado extends Empregado  {
	
	
	
	public Terceirizado(String nome, Integer horas, Double valorHora) {
		super(nome, horas, valorHora);
	}
	
	public Double pagamentoAdicional() {
		return this.pagamento() + (this.pagamento() * 0.1);
	}

}
