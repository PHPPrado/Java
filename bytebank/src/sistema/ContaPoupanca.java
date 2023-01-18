package sistema;

public class ContaPoupanca extends Conta {
	ContaPoupanca(int numero, int agencia){
		super(numero, agencia);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		
	}
}
