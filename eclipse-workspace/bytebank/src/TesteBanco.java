public class TesteBanco {
	public static void main(String[] args) {
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Henrique";
		pedro.cpf = "111-222-333-45";
		pedro.profissao = "programador";
		
		Conta contaDoPedro = new Conta(4567, 9099);
		contaDoPedro.deposita(100);
		
		contaDoPedro.setTitular(pedro);
		System.out.println(contaDoPedro.getTitular().getNome());
	}
}
