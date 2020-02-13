package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import enums.Cargo;
import enums.OrderStatus;

public class Trabalhador {
	
	private String nome;
	private Cargo cargo;
	private double salario;
	private ArrayList<Contrato> listaContratos = new ArrayList<>();
	
	
	public Trabalhador(String nome, Cargo cargo) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = getSalario();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		
		if(this.cargo == Cargo.JUNIOR) {
			return 1000;
		}
		else if(this.cargo == Cargo.PLENO) {
			return 2500;
		}
		
		
		return 3000;
		
	}

	
	public void addContrato(Contrato contrato) {
		listaContratos.add(contrato);
	}
	public Double montantePendente(int mes, int ano) throws ParseException {
		Calendar cal = Calendar.getInstance();
		Double montante = 0.0;
		for (Contrato contrato : listaContratos) {	
			cal.setTime(contrato.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(c_mes == mes && c_ano == ano) {
				montante += contrato.valorContrato();
			}
		}
		return montante;
	}
	
	

}
