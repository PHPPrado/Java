package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CriandoConexao {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Restaurante";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			System.out.println("Conectado ao banco de dados com sucesso!");
		} catch (Exception e) {
			System.out.println("ERRO");
		}
	}
}
