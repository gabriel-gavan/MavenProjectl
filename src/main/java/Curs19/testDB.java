package Curs19;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class testDB {

	
		public static String URL = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
				
		public static String USER = "demouser";
		public static String PASS = "demouser";
		
		public static void main(String[] args) {
			
			Connection conn = DBConn.openDBConnection(URL, USER, PASS);
			String selectQuery = "select * from customers";
			String UpdateQuery = "update customer set CustomerName = 'Hanna Mooss' where CustomerName = 'Hanna Moos'";
			String deleteQuery = "delete from customers where CustomerName = 'Mia Mioara'";
			System.out.println(dbQueries.dbSelectQuery(conn, selectQuery));
			System.out.println("----------------------");
			System.out.println(dbQueries.dbSelectQuery(conn, selectQuery));
			
			dbQueries.DBUpdateQuery (conn,UpdateQuery);
			System.out.println("----------------------");
			
			System.out.println("----------------------");
			
			dbQueries.DBDeleteQuery(conn, deleteQuery);
			System.out.println(dbQueries.dbSelectQuery(conn, selectQuery));
			DBConn.closeDbConnection(conn);
		}
		
		
}
