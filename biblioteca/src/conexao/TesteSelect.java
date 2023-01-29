package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteSelect {

	//SELECT
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String sql = "SELECT * FROM Livros";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			System.out.println("Conectado ao banco de dados com sucesso!");
			PreparedStatement pesquisa = conexao.prepareStatement(sql);
			ResultSet resultado = pesquisa.executeQuery();
			while (resultado.next()) {
				String titulo = resultado.getString("titulo");
				String autor = resultado.getString("autor");
				System.out.println("Título: " + titulo + " ---- Autor: " + autor);
			}
		} catch (Exception e) {
			System.out.println("ERRO");
		}
	}
}
