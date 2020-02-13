package entities;

public class PessoaFisica extends Pessoa {
	
	private double gastosMedicos;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosMedicos) {
		super(nome, rendaAnual);
		this.gastosMedicos = gastosMedicos;
	}

	public double getGastosMedicos() {
		return gastosMedicos;
	}

	public void setGastosMedicos(double gastosMedicos) {
		this.gastosMedicos = gastosMedicos;
	}

	@Override
	public Double getImposto() {
		double descontoSaude = 0.0;
		if (this.getGastosMedicos() > 0 && this.getRendaAnual() < 20000) {
			descontoSaude = this.gastosMedicos / 2;
			return this.getRendaAnual() * 0.15 - descontoSaude;
		}
		if(this.getRendaAnual() < 20000) {
			return this.getRendaAnual() * 0.15; 
		}
		if (this.getGastosMedicos() > 0 && this.getRendaAnual() > 20000) {
			descontoSaude = this.gastosMedicos / 2;
			return this.getRendaAnual() * 0.25 - descontoSaude;
		}
		if(this.getRendaAnual() > 20000) {
			return this.getRendaAnual() * 0.25; 
		}
		return 0.0;
	}
	
	

}
