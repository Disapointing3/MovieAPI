package pointing.dis.movieSheesh;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //mongo is so smart that just by putting in this line, it understands that we want to use imdbid instead of objectid
    //for the urls and searching
    Optional<Movie> findMovieByImdbId(String imdbId);


}
