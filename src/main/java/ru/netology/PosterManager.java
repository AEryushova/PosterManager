package ru.netology;

public class PosterManager {
    private String[] films = new String[0];
    private int limitFilm;


    public PosterManager() {
        limitFilm = 10;
    }

    public PosterManager(int limitFilm) {
        this.limitFilm = limitFilm;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limitFilm) {
            resultLength = films.length;
        } else {
            resultLength = limitFilm;
        }
        String[] reversed = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }
}
