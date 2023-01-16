package sistema;
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta(3436, 8765);
		conta.deposita(200);
		System.out.println(conta.saca(400));
		System.out.println(conta.getSaldo());
		
	}
}
