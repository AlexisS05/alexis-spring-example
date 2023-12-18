package com.alexis.alexisspringproject;

public class Anime {
    private double id = 0;
    private String name = "Frieren";
    private String genre = "Fantasy";

    public Anime() {
    }

    public Anime(double id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
