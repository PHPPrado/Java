package bytebank2;

public class AutenticaConfig {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
