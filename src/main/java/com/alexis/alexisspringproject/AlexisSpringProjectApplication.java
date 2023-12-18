package com.alexis.alexisspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlexisSpringProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AlexisSpringProjectApplication.class, args);
	}

	@Autowired
	AnimeDAO animeDAO;

	@Override
	public void run(String... args) throws Exception {
		Anime anime = animeDAO.getAnime();
		System.out.println(anime);
	}
}
