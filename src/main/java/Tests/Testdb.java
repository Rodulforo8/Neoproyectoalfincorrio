package Tests;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testdb {

	public static void main(String[] args) {
	
		
		String jdbcUrl="jdbc:postgresql://localhost:5432/neobanco?useSSL=false";
		String user="postgres";
		String pass="pacificlogging";
		
		try {
			System.out.println("Conectando......: " +jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			
			System.out.println("Conectado a la base de datos");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
