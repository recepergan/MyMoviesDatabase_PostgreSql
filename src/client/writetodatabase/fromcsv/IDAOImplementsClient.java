package client.writetodatabase.fromcsv;

import java.sql.Connection;
import java.util.ArrayList;

import com.bilgeadam.recepergan.database.DatabaseConnection;

public interface IDAOImplementsClient<T> {
	// gövdesiz metotlarımızı yazdık
	
	public void insert(T t); // insert into tabloAdi() values
	
	public void update(T t); // upddate tabloadi set adi ="?";
	
	public void delete(T t); // delete from tabloadi where adi = "?";
	
	public ArrayList<T> list(); // select
	
	// gövdeli metot
	default Connection getInterfaceConnection() {
		
		return DatabaseConnection.getInstance().getConnection();
		
	}
}
