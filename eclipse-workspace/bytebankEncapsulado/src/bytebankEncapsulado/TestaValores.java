package bytebankEncapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24588);
		System.out.println(conta.getAgencia());
		Conta conta2 = new Conta(5565, 4434);
		
		System.out.println("O total é: " + Conta.getTotal());
		
	}
}