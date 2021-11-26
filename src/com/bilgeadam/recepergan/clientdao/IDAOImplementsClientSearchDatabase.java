package com.bilgeadam.recepergan.clientdao;

import java.util.ArrayList;

import com.bilgeadam.recepergan.clientdto.MoviesCsvDto;
import com.bilgeadam.recepergan.clientdto.MoviesCsvDtoPacket;

public interface IDAOImplementsClientSearchDatabase {
	
	public ArrayList<MoviesCsvDto> daoClientSearchByYear(String year);
	
	public ArrayList<MoviesCsvDto> daoClientSearchByCategory(String searchCategory);
	
	public ArrayList<MoviesCsvDto> daoClientSearchByMoviesName(String name);
	
	public ArrayList<MoviesCsvDtoPacket> daoClientSearchByArthistName(String artistName);
	
}