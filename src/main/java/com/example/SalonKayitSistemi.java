package com.example;

import java.util.ArrayList;
import java.util.List;

public class SalonKayitSistemi {
    private final List<Salon> salonlar;

    public SalonKayitSistemi() {
        this.salonlar = new ArrayList<>();
    }

    public void salonEkle(Salon salon) {
        salonlar.add(salon);
    }

    public List<Salon> getSalonlar() {
        return salonlar;
    }
}