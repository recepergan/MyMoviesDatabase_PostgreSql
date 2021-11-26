package com.bilgeadam.recepergan.main;

import com.bilgeadam.recepergan.server.ServerTsv;

public class MainStartProject {
	
	public static void main(String[] args) {
		Thread serverTsv = new Thread() {
			
			@Override
			public void run() {
				
				ServerTsv server = new ServerTsv();
				
				while (true) {
					server.runServer();
				}
			}
			
		};
		
		serverTsv.start();
		MenuMovies menuMovies = new MenuMovies();
		menuMovies.startUp();
		
	}
	format
}

// DaoClientReadToDatabase daoClientReadToDatabase = new
// DaoClientReadToDatabase();
// daoClientReadToDatabase.readCsvDatabase();
