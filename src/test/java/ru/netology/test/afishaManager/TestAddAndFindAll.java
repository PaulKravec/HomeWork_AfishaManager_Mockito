package ru.netology.test.afishaManager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.afishaManager.AfishaManager;

public class TestAddAndFindAll {

    @Test
    public void shouldAddFilms(){

        AfishaManager afisha = new AfishaManager();

        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");

        String[] expectedAfisha = {"film1","film2","film3","film4","film5"};
        String[] actualAfisha = afisha.findAll();

        Assertions.assertArrayEquals(expectedAfisha, actualAfisha);
    }
}
