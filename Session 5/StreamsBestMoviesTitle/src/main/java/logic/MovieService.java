package logic;

import data.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class MovieService {
    public List<String> getTitlesOfBestRatedMovies(List<Movie> movies) {
        return movies.stream()
                .filter(movie -> movie.rating() >= 3)
                .map(movie -> movie.title())
                .map(title -> title.toUpperCase())
                .collect(Collectors.toList());
    }
}
