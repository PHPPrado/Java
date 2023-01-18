package sistema;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
}
