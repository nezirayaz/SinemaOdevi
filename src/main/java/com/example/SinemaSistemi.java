package com.example;

import java.util.Scanner;

public class SinemaSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalonKayitSistemi salonKayitSistemi = new SalonKayitSistemi();

        while (true) {
            System.out.println("1. Yeni Müşteri Ekle");
            System.out.println("2. Yeni Film Ekle");
            System.out.println("3. Yeni Salon Ekle");
            System.out.println("4. Filmleri Listele");
            System.out.println("5. Salondaki Müşterileri Listele");
            System.out.println("6. Çıkış");
            int secim = scanner.nextInt();
            scanner.nextLine(); // newline karakterini temizle

            switch (secim) {
                case 1:
                    System.out.print("Müşteri ID: ");
                    int musteriId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Müşteri İsmi: ");
                    String musteriIsmi = scanner.nextLine();
                    Musteri musteri = new Musteri(musteriId, musteriIsmi);
                    System.out.print("Salon ID: ");
                    int salonId = scanner.nextInt();
                    scanner.nextLine();
                    for (Salon salon : salonKayitSistemi.getSalonlar()) {
                        if (salon.getId() == salonId) {
                            salon.musteriEkle(musteri);
                            musteri.kayitYap();
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Film Adı: ");
                    String filmAdi = scanner.nextLine();
                    System.out.print("Film Süresi: ");
                    int filmSure = scanner.nextInt();
                    scanner.nextLine(); // newline karakterini temizle
                    System.out.print("Film Türü: ");
                    String filmTur = scanner.nextLine();
                    Film film = new Film(filmAdi, filmSure, filmTur);
                    System.out.print("Salon ID: ");
                    salonId = scanner.nextInt();
                    scanner.nextLine();
                    for (Salon salon : salonKayitSistemi.getSalonlar()) {
                        if (salon.getId() == salonId) {
                            salon.filmEkle(film);
                            film.BilgiGoster();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Salon ID: ");
                    salonId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Salon İsmi: ");
                    String salonIsmi = scanner.nextLine();
                    Salon salon = new Salon(salonId, salonIsmi);
                    salonKayitSistemi.salonEkle(salon);
                    salon.kayitYap();
                    break;
                case 4:
                    for (Salon s : salonKayitSistemi.getSalonlar()) {
                        s.BilgiGoster();
                    }
                    break;
                case 5:
                    System.out.print("Salon ID: ");
                    salonId = scanner.nextInt();
                    scanner.nextLine();
                    for (Salon s : salonKayitSistemi.getSalonlar()) {
                        if (s.getId() == salonId) {
                            s.BilgiGoster();
                            break;
                        }
                    }
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}