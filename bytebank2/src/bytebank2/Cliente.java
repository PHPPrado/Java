package bytebank2;

public class Cliente implements Autenticavel {

	private AutenticaConfig autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticaConfig();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}

