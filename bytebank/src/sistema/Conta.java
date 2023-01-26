package sistema;

public abstract class Conta{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int numero, int agencia) {
		Conta.total++;
		System.out.println("Total: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando conta " + numero + " de agência " + agencia);
	}
	
	

	public abstract void deposita(double valor);

	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque de " + valor + " reais, realizado com sucesso.");
			return true;
		} else {
			System.out.println("Você não possui saldo suficiente.");
			return false;
		}
	}
	
	public boolean tranfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			System.out.println("Sucesso na tranferência");
			return true;
		} 
		
		System.out.println("Não existe saldo suficiente.");
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}

