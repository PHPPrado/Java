package bytebank2;

public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Anna");
		g1.setSalario(5000.00);
		
		
		Funcionario ed = new EditorVideo();
		ed.setSalario(2500.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ed);
		
		System.out.println(controle.getSoma());
	}

}
