package com.example.lab07;

class GrumpyCat {
    private final String image;
    private final String name;

    GrumpyCat(String name, String image) {
        this.image = image;
        this.name = name;
    }

    String getImage() {
        return image;
    }

    String getName() {
        return name;
    }
}
