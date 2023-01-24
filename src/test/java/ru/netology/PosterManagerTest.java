package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    String movie1 = "Movie1";
    String movie2 = "Movie2";
    String movie3 = "Movie3";


    @Test
    public void shouldAddANewFilm() {
        PosterManager manager = new PosterManager();
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        String[] expected = {movie1, movie2, movie3};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseTheOrderOfTheFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOfTheMaximumLimitFilmsBelowTheBorderByDefault() {
        PosterManager manager = new PosterManager(9);
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOfTheMaximumLimitFilmsByDefault() {
        PosterManager manager = new PosterManager(10);
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOfTheMaximumLimitFilmsAboveTheBorderByDefault() {
        PosterManager manager = new PosterManager(11);
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOfTheMaximumLimitFilmsBeyondTheBorderByDefault() {
        PosterManager manager = new PosterManager(25);
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOfWithinTheLimitByDefault() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}