package ru.netology.test.afishaManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.afishaManager.AfishaManager;

public class TestAnyLimit {

    @Test
    public void shouldZeroFilmsAnyLimit() {
        AfishaManager afisha = new AfishaManager(5);

        String[] expected = {};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAnyFilmsZeroLimit() {
        AfishaManager afisha = new AfishaManager(0);
        afisha.addFilm("film1");
        afisha.addFilm("film3");
        afisha.addFilm("film3");

        String[] expected = {};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLimitIdenticalyFilms() {
        AfishaManager afisha = new AfishaManager(3);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");

        String[] expected = {"film3","film2","film1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFilmsOneLessForLimit(){
        AfishaManager afisha = new AfishaManager(6);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");

        String[] expected = {"film5", "film4", "film3","film2","film1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldFilmsMuchLessThanLimit(){
        AfishaManager afisha = new AfishaManager(15);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");

        String[] expected = {"film3", "film2","film1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFilmsMoreByOneThanLimit() {
        AfishaManager afisha = new AfishaManager(4);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");

        String[] expected = {"film5", "film4","film3","film2"};
        String[]actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsMuchMoreLimit() {
        AfishaManager afisha = new AfishaManager(1);
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
        afisha.addFilm("film12");
        afisha.addFilm("film13");
        afisha.addFilm("film14");
        afisha.addFilm("film15");

        String[] expected = {"film15"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
