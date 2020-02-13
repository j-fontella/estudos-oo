package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Empregado;
import entities.Terceirizado;

public class MainTerceirizado {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite quantos trabalhadores serao registrados");
		int trabs = scn.nextInt();
		ArrayList<Empregado> listaEmpregados = new ArrayList<>();
		
		for (int i = 0; i < trabs; i++) {
			String nome = "";
			int horas = 0, terceirizado = -1;
			double valorHora = 0.0;
			System.out.println("Digite o nome");
			nome = scn.next();
			System.out.println("Digite o numero de horas");
			horas = scn.nextInt();
			System.out.println("Digite o valor hora");
			valorHora = scn.nextDouble();	
			System.out.println("É terceirizado? 1Sim|2Nao");
			terceirizado = scn.nextInt();
			if(terceirizado == 1) {
				listaEmpregados.add(new Terceirizado(nome, horas, valorHora));
			}
			else {
				listaEmpregados.add(new Empregado(nome, horas, valorHora));
			}
		}
		
		
		for (Empregado empregado : listaEmpregados) {
			
			if (empregado instanceof Terceirizado) {
				Terceirizado e_terceirizado = (Terceirizado) empregado;
				System.out.println("Empregado terceirizado: " + e_terceirizado.getNome());
				System.out.println("Pagamento: " + e_terceirizado.pagamento());
				System.out.println("Adicional: " + e_terceirizado.pagamentoAdicional());
				continue;
			}
			System.out.println("Empregado: " + empregado.getNome());
			System.out.println("Pagamento: "+ empregado.pagamento());
		}

	}

}
