package client.writetodatabase.fromcsv;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.bilgeadam.recepergan.database.DatabaseConnection;

public class ClientRatingsWrite {
	public static void main(String[] args) {
		String PATH = "F:\\aratatil\\ratings.csv";
		writeRatingsCsvDatabase(PATH);
	}
	
	private static void writeRatingsCsvDatabase(String path) {
		
		Connection con = DatabaseConnection.getInstance().getConnection();
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(
					"COPY ratings (userid,movieid,rating,timestamp) FROM '" + path + "' DELIMITER ',' CSV HEADER;");
		} catch (SQLException e) {
			System.out.println("RatingCsv yazdırılamadı");
			e.printStackTrace();
		}
		
	}
}
// userId,movieId,rating,timestamp