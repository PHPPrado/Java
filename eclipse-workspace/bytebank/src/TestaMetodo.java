public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPedro = new Conta(2234, 9898);
		contaDoPedro.deposita(100);
		contaDoPedro.deposita(50);
		System.out.println(contaDoPedro.getSaldo());
		
		
		boolean conseguiuRetirar =contaDoPedro.saca(20);
		System.out.println(contaDoPedro.getSaldo());
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta(3323, 6768);
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.tranfere(300, contaDoPedro);
		
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoPedro.getSaldo());
		
		}
	
	
}
