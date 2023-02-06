package dev.rahul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCICDCOntroller {

    @GetMapping
    public String getHello(){
        return  "Hello World !";
    }


//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Rahul250892/primemovies.git
//    git push -u origin main

}
