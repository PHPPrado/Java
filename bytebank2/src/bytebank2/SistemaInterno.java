package bytebank2;

public class SistemaInterno {
	
	private int senha = 5555;
	
	public void autentica(Autenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso concedido!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
	
}
