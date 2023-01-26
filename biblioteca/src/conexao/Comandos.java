package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Comandos {
	
	private String teste;
	
	String url = "jdbc:mysql://localhost:3306/biblioteca";
	
	Scanner input = new Scanner(System.in);
	String comando;
	
	public void adicionar() {
		System.out.println("Digite o título do livro: ");
		String titulo = input.nextLine();
		System.out.println("Digite o nome da editora: ");
		String editora = input.nextLine();
		comando = "INSERT INTO Livros (titulo, editora) VALUES ('" + titulo + "', '" + editora + "')";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			PreparedStatement atualizar = conexao.prepareStatement(comando);
			atualizar.executeUpdate();
		} catch (Exception e) {
			System.out.println("Erro ao enviar dados");
		}
	}
}
