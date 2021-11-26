package client.writetodatabase.fromcsv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bilgeadam.recepergan.clientdto.MoviesCsvDto;

public class MoviesDao implements IDAOImplementsClient<MoviesCsvDto> {
	
	private static final String PATH = "F:\\aratatil\\movies.csv";
	
	public static void main(String[] args) {
		
		// MoviesCsvDto moviesCsvDto = new MoviesCsvDto();
		// moviesCsvDto.setTitle("Andrea Pirlo");
		// moviesCsvDto.setGenres("Drama");
		//
		// MoviesDao moviesDao = new MoviesDao();
		// moviesDao.insert(moviesCsvDto);
		//
		MoviesCsvDto moviesCsvDto3 = new MoviesCsvDto();
		moviesCsvDto3.setMovieId(4);
		
		MoviesDao moviesDao3 = new MoviesDao();
		moviesDao3.delete(moviesCsvDto3);
	}
	
	@Override
	public void insert(MoviesCsvDto t) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "insert into movies(title,genres) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, t.getTitle());
			preparedStatement.setString(2, t.getGenres());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				System.out.println(MoviesCsvDto.class + "Ekleme bassarılı");
			} else {
				System.out.println("Ekleme sırasında bir hata meydana geldi");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "MoviesCsvDto hata meydana geldi");
			e.printStackTrace();
		}
	}
	
	@Override
	public void update(MoviesCsvDto t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(MoviesCsvDto t) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "delete from movies where movieId = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, t.getMovieId());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				System.out.println(MoviesCsvDto.class + "silme bassarılı");
			} else {
				System.out.println("silme sırasında bir hata meydana geldi");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage() + "MoviesCsvDto hata meydana geldi");
		}
		
	}
	
	@Override
	public ArrayList<MoviesCsvDto> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
