package application;

import entities.Diretor;
import entities.SistemaInterno;

public class MainBanco {

	public static void main(String[] args) {
		
		
		SistemaInterno si = new SistemaInterno();
		Diretor d = new Diretor("Joao", 1576, 15500);
		d.setSenha(1234);
		
		si.autentica(d, 1234);
		
		
		
		
		
	
	}

}
