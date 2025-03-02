package com.movieflix.entities;


import jakarta.persistence.Entity;

import java.util.Set;

@Entity
public class Movie {
 

    private  Integer movieId;
    
    
    private String title;
    
    private String director;
    
    private String  studio;
    
    private Set<String> movieCaste;

    private integer releaseyear;




    
}
