package sistema;

import java.util.Scanner;

public class SistemaPrincipal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bem-vindo(a) ao banco Bytebank");
		System.out.println("Para começar a cadastrar sua conta, informe os seguintes dados: ");
		String dadoCliente = new String();
		Cliente cliente1 = new Cliente();		
		System.out.println("Informe seu nome: ");
		dadoCliente = input.nextLine();
		cliente1.setNome(dadoCliente);
		System.out.println("Informe seu cpf: ");
		dadoCliente = input.nextLine();
		cliente1.setCpf(dadoCliente);
		System.out.println("Informe sua profissão: ");
		dadoCliente = input.nextLine();
		cliente1.setProfissao(dadoCliente);
		System.out.println("Número da conta: ");
		int numero = input.nextInt();
		System.out.print("Agência: ");
		int agencia = input.nextInt();
		Conta conta1 = new ContaCorrente(numero, agencia);
		System.out.println("Insira um valor para deposito inicial: ");
		double dado = input.nextDouble();
		conta1.deposita(dado);
		System.out.println("Agora vamos realizar um saque para verificação.");
		System.out.println("Digite um valor para saque: ");
		dado = input.nextDouble();
		conta1.saca(dado);
		System.out.println("O saldo atual da sua conta é de " + conta1.getSaldo() + " reais.");
		System.out.println("Agora vamos realizar um tranferência bancária, deposite um valor na conta de João que foi criada agora..");
		Conta contaDoJoao = new ContaPoupanca(8888, 7777);
		System.out.println("Digite o valor a ser transferido: ");
		dado = input.nextDouble();
		conta1.tranfere(dado, contaDoJoao);
		System.out.println("A sua conta agora possui um saldo de " + conta1.getSaldo() + " reais.");
		System.out.println("A conta do João possui um saldo de " + contaDoJoao.getSaldo() +" reais.");
		System.out.println("____________________________________________");
		conta1.setTitular(cliente1);
		System.out.println("Muito bem, agora vamos aos resultados desta simulação.");
		System.out.println("_________________________________________");
		System.out.print("A conta de " + cliente1.getNome());
		System.out.println(" de cpf " + cliente1.getCpf());
		System.out.println("e profissão registrada " + cliente1.getProfissao());
		System.out.println("O saldo disponível é de " + conta1.getSaldo());
		System.out.println("_________________________________________");
		System.out.println("O objetivos desta simulação é a criação de objetos e classes, com foco");
		System.out.println("em estudar a programação orientada a objetos.");
		System.out.println("Você pode encontrar mais sobre mim acessando meu perfil de linkedin: www.linkedin.com/in/phpprado ");
		
		
	}
}
