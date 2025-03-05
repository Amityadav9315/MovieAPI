package com.movieflix.dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public class MovieDto {


    private  Integer movieId;


    @NotBlank(message = "Please provide movie title")
    private String title;

    @NotBlank(message = "Please provide movie director")
    private String director;

    @NotBlank(message = "Please provide movie studio")
    private String  studio;


    private Set<String> movieCast;

    private Integer releaseYear;

    @NotBlank(message = "Please provide movie poster")
    private String poster;

}
