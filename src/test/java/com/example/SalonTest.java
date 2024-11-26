package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SalonTest {

    @Test
    public void testFilmEkle() {
        Salon salon = new Salon(1, "Salon 1");
        Film film = new Film("Film 1", 120, "Aksiyon");
        salon.filmEkle(film);
        assertEquals(1, salon.getFilmler().size());
        assertEquals("Film 1", salon.getFilmler().get(0).getAd());
    }

    @Test
    public void testMusteriEkle() {
        Salon salon = new Salon(1, "Salon 1");
        Musteri musteri = new Musteri(1, "Müşteri 1");
        salon.musteriEkle(musteri);
        assertEquals(1, salon.getMusteriler().size());
        assertEquals("Müşteri 1", salon.getMusteriler().get(0).getName());
    }
}