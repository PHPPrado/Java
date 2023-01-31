package conexao;

import java.util.Scanner;

public class TesteSistema {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cliente cliente = new Cliente();
		System.out.println("Digite seu nome de usuário: ");	
		cliente.setNome(input.nextLine());
		System.out.println("Digite seu email de cadastro: ");	
		cliente.setEmail(input.nextLine());
		System.out.println("Senha: ");	
		cliente.setSenha(input.nextLine());
		cliente.validacao(cliente.getSenha());
		System.out.println("Bem vindo ao sistema");
		String titulo = cliente.verificarReserva();
		
		int escolha = 10;
		while (escolha != 0) {
			System.out.println(" ");
			System.out.println("Olá " + cliente.getNome() + "!");
			System.out.println(" ");
			System.out.println("Escolha o que deseja fazer:");
			System.out.println("Adicionar livro...............[1]");
			System.out.println("Pesquisar por título..........[2]");
			System.out.println("Pesquisar por autor...........[3]");
			System.out.println("Reservar livro................[4]");
			System.out.println("Devolver livro................[5]");
			System.out.println("Sair..........................[0]");
			escolha = input.nextInt();
			switch (escolha) {
			case 1:
				cliente.adicionar();
				break;
			case 2:
				cliente.pesquisarTitulo();
				break;
			case 3:
				cliente.pesquisarAutor();
				break;
			case 4:
				cliente.reservar(titulo);
				titulo = cliente.verificarReserva();
				break;
			case 5:
				cliente.devolver(titulo);
//				cliente.devolver();
				break;
			case 0:
				System.exit(0);
			}
		}
		






	
	}

}
