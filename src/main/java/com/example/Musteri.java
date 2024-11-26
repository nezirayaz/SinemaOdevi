package com.example;

public class Musteri extends BaseEntity implements IKayit {
    public Musteri(int id, String name) {
        super(id, name);
    }

    @Override
    public void BilgiGoster() {
        System.out.println("Müşteri ID: " + getId() + ", Adı: " + getName());
    }

    @Override
    public void kayitYap() {
        System.out.println("Müşteri kaydı yapıldı: " + getName());
    }
}