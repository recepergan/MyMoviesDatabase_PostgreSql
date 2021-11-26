package com.bilgeadam.recepergan.clientdao;

import java.sql.Connection;

import com.bilgeadam.recepergan.database.DatabaseConnection;

public interface IClientsCsvWrite {
	
	public void writeCsvDatabase();
	
	default Connection getInterfaceConnection() {
		
		return DatabaseConnection.getInstance().getConnection();
		
	}
}
