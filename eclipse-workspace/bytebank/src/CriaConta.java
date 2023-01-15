public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1212, 5555);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(9993, 7655);
		segundaConta.deposita(300);
		
		System.out.println("Na primeira conta tem: " + primeiraConta.getSaldo());
		System.out.println("Na segunda conta tem: " + segundaConta.getSaldo());
		
		primeiraConta.setAgencia(1337);
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getTitular());
		
		
		System.out.println(segundaConta.getAgencia());
		System.out.println(segundaConta.getTitular());
		
		segundaConta.setAgencia(146);
		System.out.println(segundaConta.getAgencia());
		
		
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
		
		
	
	}
	
}
