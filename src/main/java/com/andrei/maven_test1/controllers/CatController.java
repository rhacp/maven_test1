package com.andrei.maven_test1.controllers;

import com.andrei.maven_test1.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Autowired
    CatService catService;

    @GetMapping("/cat/doCatStuff")
    public String doCatSound() {
        return catService.doCatStuff();
    }
}
