package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerLimitTest {
    String movie1 = "Movie1";
    String movie2 = "Movie2";
    String movie3 = "Movie3";
    String movie4 = "Movie4";
    String movie5 = "Movie5";
    String movie6 = "Movie6";
    String movie7 = "Movie7";
    String movie8 = "Movie8";
    String movie9 = "Movie9";
    String movie10 = "Movie10";
    String movie11 = "Movie11";

    @Test
    public void shouldReverseTheOrderOfTheMaximumFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        manager.addFilm(movie5);
        manager.addFilm(movie6);
        manager.addFilm(movie7);
        manager.addFilm(movie8);
        manager.addFilm(movie9);
        manager.addFilm(movie10);
        String[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseTheOrderOfTheEqualsFilms() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        String[] expected = {movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseTheOrderOfTheMaxFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        manager.addFilm(movie5);
        manager.addFilm(movie6);
        manager.addFilm(movie7);
        manager.addFilm(movie8);
        manager.addFilm(movie9);
        manager.addFilm(movie10);
        manager.addFilm(movie11);
        String[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseTheOrderOfTheMaximumLimitFilms() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        manager.addFilm(movie5);
        String[] expected = {movie5, movie4, movie3, movie2};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}