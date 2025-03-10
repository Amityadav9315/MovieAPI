package com.movieflix.controllers;


import com.movieflix.service.FileService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/file/")
public class FileControllers {

    private final FileService fileService;
     public FileControllers(FileService fileService){
         this.fileService=fileService;


     }
     @Value("${projects.poster}")
     private String path;
    @PostMapping("/upload")
    public ResponseEntity<String>uploadFileHandler(@RequestPart MultipartFile file) throws IOException {
         String  uploadedFileName=fileService.uploadFile(path,file);
         return ResponseEntity.ok("File uploaded succesfully"+ uploadedFileName);


     }
     @GetMapping("/{fileName}")
     public void serverFileHandler(@PathVariable String fileName, HttpServletResponse response) throws IOException{

         InputStream resourceFile=fileService.getResourceFile(path,fileName);
         response.setContentType(MediaType.IMAGE_GIF_VALUE);
         StreamUtils.copy(resourceFile,response.getOutputStream());

     }


}
