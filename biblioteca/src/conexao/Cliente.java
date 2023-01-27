package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cliente extends Comandos {
	private String nome;
	private static String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void cadastrarCliente(String email) {
		System.out.println("Digite o novo nome de usuário que deseja cadastrar: ");
		String nome = input.nextLine();
		comando = "INSERT INTO Clientes (nome, email, reservas) VALUES ('" + nome + "', '" + email + "', 'NÃO')";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			PreparedStatement adicionar = conexao.prepareStatement(comando);
			adicionar.executeUpdate();
			System.out.println("Novo usuário cadastrado com sucesso");
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar cliente");
		}
	}
	
	
	
	public boolean validacao(String email) {
		this.email = email;
		String resultado = null;
		comando = "SELECT email FROM clientes WHERE email LIKE '"+ email + "'";
		try {
			Connection conexao = DriverManager.getConnection(url,"root","");
			PreparedStatement pesquisa = conexao.prepareStatement(comando);
			ResultSet result = pesquisa.executeQuery();
			while (result.next()) {
				resultado = result.getString("email");
			}
			if (resultado.equals(email)) {
				return true;
			} else { //nunca vai cair nesse else
				return false;
			}
		} catch (Exception e) {
			System.out.println("Cliente não encontrado, adicionando novo cliente ao banco de dados.");
			cadastrarCliente(email);
			return false;
		}
		
	}
}
