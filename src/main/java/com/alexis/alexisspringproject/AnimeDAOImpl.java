package com.alexis.alexisspringproject;

import org.springframework.stereotype.Component;

@Component
public class AnimeDAOImpl implements AnimeDAO {
    @Override
    public Anime getAnime() {
        return new Anime();
    }
}
