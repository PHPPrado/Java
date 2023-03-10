package bytebank2;
// Gerente herda caracteristicas do funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticaConfig autenticador;

	public Gerente() {
		this.autenticador = new AutenticaConfig();
	}
	
	public double getBonificacao() {
		return super.getSalario();
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