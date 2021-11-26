package com.bilgeadam.recepergan.clientcontroller;

import java.util.ArrayList;

import com.bilgeadam.recepergan.clientdao.DaoClientDoSearchToDatabase;
import com.bilgeadam.recepergan.clientdao.IDAOImplementsClientSearchDatabase;
import com.bilgeadam.recepergan.clientdto.MoviesCsvDto;
import com.bilgeadam.recepergan.clientdto.MoviesCsvDtoPacket;

public class ControllerClientSearchDatabase implements IDAOImplementsClientSearchDatabase {
	
	private static ControllerClientSearchDatabase instance;
	private DaoClientDoSearchToDatabase dao;
	
	private ControllerClientSearchDatabase() {
		dao = new DaoClientDoSearchToDatabase();
	}
	
	public static ControllerClientSearchDatabase getInstance() {
		if (instance == null) {
			instance = new ControllerClientSearchDatabase();
		}
		return instance;
		
	}
	
	@Override
	public ArrayList<MoviesCsvDto> daoClientSearchByYear(String year) {
		// TODO Auto-generated method stub
		return dao.daoClientSearchByYear(year);
	}
	
	@Override
	public ArrayList<MoviesCsvDto> daoClientSearchByCategory(String searchCategory) {
		// TODO Auto-generated method stub
		return dao.daoClientSearchByCategory(searchCategory);
	}
	
	@Override
	public ArrayList<MoviesCsvDto> daoClientSearchByMoviesName(String name) {
		// TODO Auto-generated method stub
		return dao.daoClientSearchByMoviesName(name);
	}
	
	@Override
	public ArrayList<MoviesCsvDtoPacket> daoClientSearchByArthistName(String artistName) {
		// TODO Auto-generated method stub
		return dao.daoClientSearchByArthistName(artistName);
	}
	
}
