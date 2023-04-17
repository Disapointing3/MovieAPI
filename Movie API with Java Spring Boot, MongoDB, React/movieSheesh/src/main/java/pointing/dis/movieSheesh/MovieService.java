package pointing.dis.movieSheesh;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService { //most of business logic
    @Autowired //automatically initializes stuff, like initializing a MovieRepository class for us
    private MovieRepository movieRepository;
    public List<Movie> allMovies()
    {
        return movieRepository.findAll(); //method defined in mongo repository class
    }

    public Optional<Movie> singleMovie(String imdbId) //optional bc method might return null bc id doesn't exist
    {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
