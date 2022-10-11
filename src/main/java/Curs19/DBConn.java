package Curs19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	public static Connection openDBConnection(String URL, String User, String Pass)

	{
		Connection conn =null;
		try {
			conn = DriverManager.getConnection(URL, User, Pass);		
			System.out.println("Conexiune cu success!");
		}catch(SQLException e) {
			System.out.println("Nu am putut face conexiunea la baza de rdte");
		}
		return conn;
	}
	public static void closeDbConnection (Connection conn) {
		try {
			System.out.println("Incerc sa inchid conexiunea!");
			conn.close();
			System.out.println("Conexiunea a fost inchisa.");
		}catch (SQLException e) {
			System.out.println("Nu am putut inchide conexiunea");
		}
	}
}

