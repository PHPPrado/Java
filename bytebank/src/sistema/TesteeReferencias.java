package sistema;
public class TesteeReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new ContaCorrente(1678, 3333);
		primeiraConta.deposita(300);
		
		System.out.println("Saldo da primeira conta é: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da primeira conta é: " + segundaConta.getSaldo());

		
		segundaConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
