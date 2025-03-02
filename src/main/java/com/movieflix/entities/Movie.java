package com.movieflix.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

@Entity
public class Movie {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable=false,length = 200)
    @NotBlank(message = "Please provide movie ticket ")
    private  Integer movieId;

    @Column(nullable=false)
    @NotBlank(message = "Please provide movie title")
    private String title;

    @Column(nullable=false)
    @NotBlank(message = "Please provide movie director")
    private String director;

    @Column(nullable=false)
    @NotBlank(message = "Please provide movie studio")
    private String  studio;

    @ElementCollection
    @CollectionTable(name="movie-caste")
    private Set<String> movieCaste;

    @Column(nullable=false)
    @NotBlank(message = "Please provide movie release year")
    private Integer releaseYear;

    @Column(nullable=false)
    @NotBlank(message = "Please provide movie poster")
    private String poster;




    
}
