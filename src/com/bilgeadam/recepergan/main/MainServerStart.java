package com.bilgeadam.recepergan.main;

import com.bilgeadam.recepergan.server.ServerTsv;

public class MainServerStart {
	
	public static void main(String[] args) {
		ServerTsv serverTsv = new ServerTsv();
		serverTsv.runServer();
	}
}
