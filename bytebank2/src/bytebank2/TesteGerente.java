package bytebank2;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("João");
		g1.setCpf("333-333-333-02");
		g1.setSalario(4000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		g1.setSenha(2222);
		boolean validacao = g1.autentica(2222);
		System.out.println(validacao);
		System.out.println(g1.getBonificacao());

	}

}
