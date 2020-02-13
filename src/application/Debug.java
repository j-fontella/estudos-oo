package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Contrato;
import entities.Empregado;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Terceirizado;
import entities.Trabalhador;
import enums.Cargo;

public class Debug {

	public static void main(String[] args) throws ParseException {
		
		PessoaFisica pf = new PessoaFisica("Joao", 50000.0, 2000.0);
		
		System.out.println(pf.getImposto());
		PessoaJuridica pj = new PessoaJuridica("SSW", 400000.0, 25);
		System.out.println(pj.getImposto());
		

	}

}
