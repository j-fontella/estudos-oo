package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contrato;
import entities.Pedido;
import entities.Trabalhador;
import enums.Cargo;
import enums.OrderStatus;



public class MainContrato {

	public static void main(String[] args) throws ParseException {
		
		Scanner scn = new Scanner(System.in);
		Trabalhador t = new Trabalhador("Joao", Cargo.SENIOR);
		SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy"); 

		
		System.out.println("Digite quantos contratos fechou no mes");
		int contratos = scn.nextInt();
		for (int i = 0; i < contratos; i++) {
			System.out.println("Entre com a data");
			String data = scn.next();
			System.out.println("Entre com o valor da hora");
			Double valorHora = scn.nextDouble();
			System.out.println("Entre quantas horas foram trabalhadas");
			Integer horas = scn.nextInt();
			t.addContrato(new Contrato(formato.parse(data), valorHora, horas));		
		}
		
		int navegador = -1;
		int mes, ano;
		Date dataProcurada = new Date();
		while(navegador != 0) {
			System.out.println("Digite e envie o mes e o ano do contrato");
			mes = scn.nextInt();
			ano = scn.nextInt();
			System.out.println("Montante da data solicitada");
			System.out.println(t.montantePendente(mes, ano));
			System.out.println("Deseja fazer outra pesquisa (1-s 2-n");
			navegador = scn.nextInt();
			
		}
	
		

	}

}
