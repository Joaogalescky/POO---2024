package dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoBD {
	public Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "aluno", "aluno");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return conn;
	}
}
