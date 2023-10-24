package com.andrei.maven_test1.models;

import lombok.Data;

@Data
public class Cat {

    private String catName;

    @Override
    public String toString() {
        return "Cat [" +
                "Cat Name='" + catName + '\'' +
                ']';
    }
}
