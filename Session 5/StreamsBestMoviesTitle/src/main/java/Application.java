import data.Movie;
import logic.MovieService;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Movie movie1 = new Movie("aaa", 3, 2024);
        Movie movie2 = new Movie("bbb", 2, 2024);
        Movie movie3 = new Movie("ccc", 5, 2024);
        MovieService movieService = new MovieService();
        List<Movie> movies = new ArrayList<>(List.of(movie1, movie2, movie3));
        List<String> bestMovieTitles = movieService.getTitlesOfBestRatedMovies(movies);
        System.out.println(bestMovieTitles);
    }
}
