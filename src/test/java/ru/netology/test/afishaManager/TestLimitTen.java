package ru.netology.test.afishaManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.afishaManager.AfishaManager;

public class TestLimitTen {

    @Test
    public void shouldArrayLessThanTen() {

        AfishaManager afisha = new AfishaManager();
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");
        afisha.addFilm("film8");
        afisha.addFilm("film9");

        String[] expected = {"film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldArrayMoreThanTen() {
        AfishaManager afisha = new AfishaManager();
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");
        afisha.addFilm("film8");
        afisha.addFilm("film9");
        afisha.addFilm("film10");
        afisha.addFilm("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldArrayIsEqualToTen() {
        AfishaManager afisha = new AfishaManager();
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");
        afisha.addFilm("film8");
        afisha.addFilm("film9");
        afisha.addFilm("film10");

        String[] expected = {"film10", "film9", "film8", "film7","film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
