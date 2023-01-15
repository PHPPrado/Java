package bytebankEncapsulado;

public class TesteGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 7789);
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Henrique");
		
		conta.setTitular(pedro);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
	}
}
