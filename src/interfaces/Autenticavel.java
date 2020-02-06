package interfaces;

public interface Autenticavel {
	
	public abstract boolean autentica (int senha);
	public abstract int getSenha();
	public abstract void setSenha(int senha);

}
