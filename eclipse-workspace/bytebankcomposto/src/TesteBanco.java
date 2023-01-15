public class TesteBanco {
	public static void main(String[] args) {
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Henrique";
		pedro.cpf = "111-222-333-45";
		pedro.profissao = "programador";
		
		Conta contaDoPedro = new Conta();
		contaDoPedro.deposita(100);
		
		contaDoPedro.titular = pedro;
		System.out.println(contaDoPedro.titular.nome);
	}
}