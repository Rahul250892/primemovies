package dev.rahul.services;

import dev.rahul.entity.Movie;
import dev.rahul.repository.MoviesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository repository;
    public List<Movie> getAllMovies(){


        System.out.println(repository.findAll().toString());
      return  repository.findAll();
    }

    public Optional<Movie> singleMovie(String id){

        return repository.findMovieByImdbId(id);
    }
}
