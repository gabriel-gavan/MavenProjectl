package Curs19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class dbQueries {

		public static List<String> dbSelectQuery(Connection conn, String Query) {
			List <String> resultList = new ArrayList<String>();
			try {
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(Query);
				
				while (resultSet.next()) {
					resultList.add(resultSet.getString(3));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
				}
			} catch(SQLException e) {
				System.out.println("Nu am putut executa query-ul");
			}
			return resultList;
		}
		public static void DBUpdateQuery(Connection conn, String query) {
			try {
				Statement statement = conn.createStatement();
				statement.executeUpdate(query);
				System.out.println("Am facut Update!");
			}catch (SQLException e) {
				System.out.println("Nu am putut face update!");
			}
				
			}
	public static void DBDeleteQuery(Connection conn, String query) {
			try {
				Statement statement = conn.createStatement();
				statement.executeUpdate(query);
				System.out.println("Am facut delete!");
			}catch (SQLException e) {
				System.out.println("Nu am putut face delete!");
			}
				
			}
			
}
