package entities;

public class PessoaJuridica extends Pessoa {
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer totalFuncionarios) {
		super(nome, rendaAnual);
		this.totalFuncionarios = totalFuncionarios;
	}

	private Integer totalFuncionarios;



	public Integer getTotalFuncionarios() {
		return totalFuncionarios;
	}

	public void setTotalFuncionarios(Integer totalFuncionarios) {
		this.totalFuncionarios = totalFuncionarios;
	}
	
	@Override
	public Double getImposto() {
		if(this.getTotalFuncionarios() > 10) {
			return this.getRendaAnual() * 0.14;
		}
		return this.getRendaAnual() * 0.16;
	}
	
	

}
