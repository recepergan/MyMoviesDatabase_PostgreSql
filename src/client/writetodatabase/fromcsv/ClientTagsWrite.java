package client.writetodatabase.fromcsv;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.bilgeadam.recepergan.database.DatabaseConnection;

public class ClientTagsWrite {
	public static void main(String[] args) {
		String PATH = "F:\\aratatil\\tags.csv";
		writeTagsCsvDatabase(PATH);
		
	}
	
	private static void writeTagsCsvDatabase(String path) {
		
		Connection connection = DatabaseConnection.getInstance().getConnection();
		
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate("COPY tags FROM '" + path + "' DELIMITER ',' CSV HEADER;");
		} catch (SQLException e) {
			System.out.println("TagsCsv yazdırılamadı");
			e.printStackTrace();
		}
	}
}
