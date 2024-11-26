package com.example;

public class Film {
    private final String ad;
    private final int sure;
    private final String tur;

    public Film(String ad, int sure, String tur) {
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public int getSure() {
        return sure;
    }

    public String getTur() {
        return tur;
    }

    public void BilgiGoster() {
        System.out.println("Film Adı: " + ad + ", Süresi: " + sure + " dakika, Türü: " + tur);
    }
}