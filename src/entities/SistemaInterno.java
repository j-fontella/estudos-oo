package entities;
import interfaces.Autenticavel;

public class SistemaInterno {
	
	public void autentica(Autenticavel ac, int senha) {
		if(ac.getSenha() == senha) {
			System.out.println("Login feito com sucesso");
		}
		else {
			System.out.println("Senha incorreta, tente novamente");
		}
	}
}
