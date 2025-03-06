package com.movieflix.controllers;


import com.movieflix.service.FileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file/")
public class FileControllers {

    private final FileService fileService;
     public Filecontroller(FileService fileService){

     }


}
