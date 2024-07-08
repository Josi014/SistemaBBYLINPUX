package model;
import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/** Módulo de conexão **/
	// Parâmetros de conexão
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbbudgetsystem?userTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "6714J0sIJ88";
	// Método de conexão	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			//O objeto "con" estabelece uma conexão com o banco de dados. DriverManager gerencia o driver e o getConnection obtém os parâmetros de conexão
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	//teste de conexão
	public void testeConexão() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
