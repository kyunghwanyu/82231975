package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
//api/v1/user

@Slf4j

@RestController // controller임을 알려주는 표시
@RequestMapping("/api") 

public class EmpNoRestController {
    // method는 GET타입으로 받고, path는 localhost:8080/api/getMethod
    @RequestMapping(method = RequestMethod.GET, path = "/v1/user") 
    public String getRequest() {

        return "82231975";
    }
}
