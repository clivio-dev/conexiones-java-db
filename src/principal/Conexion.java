package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	public String driver = "com.mysql.jdbc.Driver",
			url = "jdbc:mysql://localhost:3306/test",
			user = "root",
			pass = "root";
	
	public Connection getConnectionSimple() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
	
}
