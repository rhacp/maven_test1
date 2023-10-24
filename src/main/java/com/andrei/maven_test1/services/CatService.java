package com.andrei.maven_test1.services;

import com.andrei.maven_test1.models.Cat;

public interface CatService {

    Cat createCat(String name);
    String doCatStuff();
}
