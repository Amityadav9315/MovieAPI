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

    private String title;
    
    private String director;
    
    private String  studio;
    
    private Set<String> movieCaste;

    private Integer releaseYear;




    
}
