package entities;

import java.util.Date;

public  class Contrato {
	
	private Date data;
	private Double valorPorHora;
	private Integer hora;
	
	public Contrato(Date data, Double valorPorHora, Integer hora) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.hora = hora;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Double valorContrato() {
		return valorPorHora * hora;
	}
	
	
}
