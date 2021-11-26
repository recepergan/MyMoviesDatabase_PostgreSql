package client.writetodatabase.fromcsv;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.bilgeadam.recepergan.database.DatabaseConnection;

public class ClientMoviesWrite {
	public static void main(String[] args) {
		String PATH = "F:\\aratatil\\movies.csv";
		writeMoviesCsvDatabase(PATH);
	}
	
	private static void writeMoviesCsvDatabase(String path) {
		
		Connection con = DatabaseConnection.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate("COPY movies FROM '" + path + "' DELIMITER ',' CSV HEADER;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
