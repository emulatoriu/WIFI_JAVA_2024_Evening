package logic;

import data.Movie;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void getTitlesOfBestRatedMovies() {
        //Arrange
        Movie movie1 = new Movie("aaa", 3, 2024);
        Movie movie2 = new Movie("bbb", 2, 2024);
        Movie movie3 = new Movie("ccc", 5, 2024);
        MovieService movieService = new MovieService();
        List<Movie> movies = new ArrayList<>(List.of(movie1, movie2, movie3));
        //Act
        List<String> result = movieService.getTitlesOfBestRatedMovies(movies);
        //Assert
        assertEquals(List.of("AAA", "CCC"), result);
        List<String> result2 = movieService.getTitlesOfBestRatedMovies(List.of());
        assertEquals(List.of(),result2 );
    }

    @Test
    void getTitlesOfBestRatedMovies2() {
        //Arrange
        Movie movie1 = new Movie("aaa", 1, 2024);
        Movie movie2 = new Movie("bbb", 1, 2024);
        Movie movie3 = new Movie("ccc", 1, 2024);
        MovieService movieService = new MovieService();
        List<Movie> movies = new ArrayList<>(List.of(movie1, movie2, movie3));
        //Act
        List<String> result = movieService.getTitlesOfBestRatedMovies(movies);
        //Assert
        assertEquals(List.of(), result);
    }
}