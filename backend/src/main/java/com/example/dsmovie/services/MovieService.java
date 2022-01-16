package com.example.dsmovie.services;

import com.example.dsmovie.dto.MovieDTO;
import com.example.dsmovie.entities.Movie;
import com.example.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> moviePage = movieRepository.findAll(pageable);
        Page<MovieDTO> movieDTOPage= moviePage.map(x -> new MovieDTO(x));
        return movieDTOPage;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
       Movie movieResult = movieRepository.findById(id).get();
       MovieDTO movieDTO = new MovieDTO(movieResult);
       return movieDTO;
    }
}
