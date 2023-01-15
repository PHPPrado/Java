public class Conta{
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tranfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Sucesso na tranferência");
			return true;
		} 
		
		System.out.println("Não existe saldo suficiente.");
		return false;
	}
}
