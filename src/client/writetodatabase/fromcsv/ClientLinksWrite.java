package client.writetodatabase.fromcsv;

import java.sql.Connection;
import java.sql.SQLException;

import com.bilgeadam.recepergan.database.DatabaseConnection;

public class ClientLinksWrite {
	public static void main(String[] args) {
		String PATH = "F:\\aratatil\\links.csv";
		
		writeLinksCsvDatabase(PATH);
		
	}
	
	public static void writeLinksCsvDatabase(String path) {
		
		Connection con = DatabaseConnection.getInstance().getConnection();
		
		java.sql.Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate("COPY links from '" + path + "' DELIMITER ',' CSV HEADER;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
