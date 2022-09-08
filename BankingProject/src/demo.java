import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabase";
		String username = "root";
		String password = "Yash@123";

		System.out.println("Connecting database...");
		try {
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("con="+connection);
			System.out.println("Database connected!");
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		}
	}

	/*
	 * static final String DB_URL = "jdbc:mysql://localhost:3306/"; static final
	 * String USER = "root"; static final String PASS = "Yash@123";
	 * 
	 * public static void main(String[] args) {
	 * 
	 * try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	 * Statement stmt = conn.createStatement();) { String sql =
	 * "CREATE DATABASE STUDENTS"; stmt.executeUpdate(sql);
	 * System.out.println("Database created successfully..."); } catch (SQLException
	 * e) { e.printStackTrace(); } }
	 */

}
