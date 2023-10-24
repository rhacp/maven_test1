package com.andrei.maven_test1.services;

import com.andrei.maven_test1.models.Cat;
import org.springframework.stereotype.Component;

@Component
public class CatServiceImpl implements CatService{

    @Override
    public Cat createCat(String name) {
        Cat cat = new Cat();
        cat.setCatName(name);
        return cat;
    }

    @Override
    public String doCatStuff() {
        return "Miau";
    }
}
