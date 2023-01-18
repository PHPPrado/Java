package bytebank2;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente pedro = new Gerente();
		pedro.setNome("Pedro Henrique");
		pedro.setCpf("222-222-222-02");
		pedro.setSalario(1500.00);
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());

	}

}
