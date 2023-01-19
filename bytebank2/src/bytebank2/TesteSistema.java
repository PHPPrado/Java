package bytebank2;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(5555);
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(7777);
		cliente.autentica(7777);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		si.autentica(adm);

	}

}
