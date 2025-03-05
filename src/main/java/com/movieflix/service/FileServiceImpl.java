package com.movieflix.service;

import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


@Service
public class FileServiceImpl implements  FileService{

    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {
       //get name of the file
        String fileName=file.getOriginalFilename();
        // to get the file path
        String filePath=path+ File.separator+fileName;

        return "";
    }

    @Override
    public InputStream getResourceFile(String path, String name) throws IOException {
        return null;
    }
}
