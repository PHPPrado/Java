package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public abstract class Comandos {
	
	String url = "jdbc:mysql://localhost:3306/biblioteca";
	
	Scanner input = new Scanner(System.in);
	String comando;
	String comando2;
	String comando3;
	
	public void adicionar() {
		System.out.println("Digite o título do livro: ");
		System.out.println("VOLTAR.................[0]");
		String titulo = input.nextLine();
		if (titulo.equals("0")) {
			return;
		}
		System.out.println("Digite o nome do autor: ");
		String editora = input.nextLine();
		
		

		comando = "INSERT INTO Livros (titulo, autor, diponibilidade) VALUES ('" + titulo + "', '" + editora + "', 'DISPONÍVEL')";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			PreparedStatement adicionar = conexao.prepareStatement(comando);
			adicionar.executeUpdate();
		} catch (Exception e) {
			System.out.println("Erro ao enviar dados");
//			throw  new  IllegalArgumentException("Erro ao enviar dados");
		}
	}
	
	public void pesquisarAutor() {
		int numero = 0;
		System.out.println("Digite o nome do autor: ");
		String autor = input.nextLine();
		comando = "SELECT titulo, autor, diponibilidade FROM Livros WHERE autor LIKE '%" + autor + "%'";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			PreparedStatement pesquisa = conexao.prepareStatement(comando);
			ResultSet resultado = pesquisa.executeQuery();
			while (resultado.next()) {
				String tituloPrint = resultado.getString("titulo");
				String autorPrint = resultado.getString("autor");
				String disponivel = resultado.getString("diponibilidade");
				numero ++;
				System.out.println("Título: " + tituloPrint + " ---- Autor: " + autorPrint + " ---- Disponibilidade: " + disponivel);
				System.out.println(" ");
			}
			System.out.println(numero + " resultados encontrados.");
		} catch (Exception e) {
			System.out.println("Erro ao pesquisar autor");
		}
	}
	
	public void pesquisarTitulo() {
		int numero = 0;
		System.out.println("Digite o título do livro: ");
		String titulo = input.nextLine();
		comando = "SELECT titulo, autor, diponibilidade FROM Livros WHERE titulo LIKE '%" + titulo + "%'";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			PreparedStatement pesquisa = conexao.prepareStatement(comando);
			ResultSet resultado = pesquisa.executeQuery();
			while (resultado.next()) {
				String tituloPrint = resultado.getString("titulo");
				String autorPrint = resultado.getString("autor");
				String disponibilidade = resultado.getString("diponibilidade");
				numero ++;
				System.out.println("Título: " + tituloPrint + " ---- Autor: " + autorPrint + " ---- Disponibilidade: " + disponibilidade);
				System.out.println(" ");
			}
			System.out.println(numero + " resultados encontrados.");
		} catch (Exception e) {
			System.out.println("Erro ao pesquisar titulo");
		}
	}
	
	public void reservar(String reservas) {
		
		if (reservas != "[SEM LIVROS RESERVADOS]") {
			System.out.println("Você ja tem um livro reservado, devolva-o para poder reservar outro.");
			return;
		}
		System.out.println("Digite o título do livro que deseja reservar: ");
		System.out.println("VOLTAR.....................................[0]");
		String titulo = input.nextLine();
		if (titulo.equals("0")) {
			return;
		}
		comando = "UPDATE Livros SET diponibilidade = 'RESERVADO' WHERE titulo = '" + titulo +"'";
		comando2 = "UPDATE Clientes SET reservas = '" + titulo + "' WHERE email = '" + Cliente.getEmail() + "'";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			PreparedStatement atualizar = conexao.prepareStatement(comando);
			PreparedStatement atualizar2 = conexao.prepareStatement(comando2);
			atualizar.executeUpdate();
			atualizar2.executeUpdate();
			System.out.println(titulo + " reservado com sucesso");
		} catch (Exception e) {
			System.out.println("Erro ao atualizar dados");
		}
	}
	
	public String verificarReserva() {
	String resultado = "[SEM LIVROS RESERVADOS]";
	comando = "SELECT reservas FROM clientes WHERE email LIKE '" + Cliente.getEmail() + "'";
	try {
		Connection conexao = DriverManager.getConnection(url,"root","");
		PreparedStatement pesquisa = conexao.prepareStatement(comando);
		ResultSet result = pesquisa.executeQuery();
		while (result.next()) {
			resultado = result.getString("reservas");
		}
		return resultado;
	} catch (Exception e) {
		System.out.println("Erro ao verificar reserva");
		resultado = "Erro";
		return resultado;
	}
}
	
	public void devolver(String titulo) {
        comando = "UPDATE Livros SET diponibilidade = 'DISPONÍVEL' WHERE titulo = '" + titulo +"'";
        comando2 = "UPDATE Clientes SET reservas = 'NÃO' WHERE email = '" + Cliente.getEmail() + "'";
        try {
            Connection conexao = DriverManager.getConnection(url,"root","");
            PreparedStatement atualizar = conexao.prepareStatement(comando);
            PreparedStatement atualizar2 = conexao.prepareStatement(comando2);
            atualizar.executeUpdate();
            atualizar2.executeUpdate();
            System.out.println(titulo + " devolvido com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar dados");
        }
    }

}
