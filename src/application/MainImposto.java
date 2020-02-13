package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class MainImposto {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		double totalArrecadado = 0;
		ArrayList<Pessoa> listaContribuintes = new ArrayList<>();
		System.out.println("Digite o numero de contribuintes");
		int contribuintes = scn.nextInt();
		
		for (int i = 0; i < contribuintes; i++) {
			int navegador = -1;
			System.out.println("Digite o nome");
			String nome = scn.next();
			System.out.println("Digite a renda anual");
			Double rendaAnual = scn.nextDouble();
			System.out.println("Digite 1 para pessoa fisica 2 juridica");
			navegador = scn.nextInt();
			switch(navegador) {
				case 1:
					System.out.println("Digite o valor de gastos medicos");
					double gastosMedicos = scn.nextDouble();
					listaContribuintes.add(new PessoaFisica(nome, rendaAnual, gastosMedicos));
					break;
				case 2:
					System.out.println("Digite o numero de funcionarios");
					int funcionarios = scn.nextInt();
					listaContribuintes.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
					break;		
			}
		}
		
		for (Pessoa pessoa : listaContribuintes) {
			totalArrecadado += pessoa.getImposto();
			if(pessoa instanceof PessoaFisica) {
				System.out.println("Pessoa fisica");
			}
			else {
				System.out.println("Pessoa juridica");
			}
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Total de impostos pagos: " + pessoa.getImposto());
		}
		System.out.println("");
		System.out.println("O total arrecadado foi: " + totalArrecadado);

	}

}
