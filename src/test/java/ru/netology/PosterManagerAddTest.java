package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerAddTest {

    PosterManager manager = new PosterManager();
    String movie1 = "Movie1";
    String movie2 = "Movie2";
    String movie3 = "Movie3";


    @BeforeEach
    public void setup() {
        manager.addFilm(movie1);
        manager.addFilm(movie2);
    }

    @Test
    public void shouldAddANewFilmToTheFilmList() {
        manager.addFilm(movie3);
        String[] expected = {movie1, movie2, movie3};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}
