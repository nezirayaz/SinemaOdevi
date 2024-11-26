# Sinema Müşteri Kayıt Sistemi

Sinema Müşteri Kayıt Sistemi, bir sinema salonunun müşteri, film ve salon yönetimini kolaylaştırmak için geliştirilmiş bir konsol tabanlı uygulamadır. Kullanıcılar, sistem üzerinden yeni müşteri, film ve salon ekleyebilir ve mevcut kayıtları görüntüleyebilir.

## Projenin Amacı

Bu proje, bir sinema işletmesi için gerekli müşteri ve film yönetimi işlevselliklerini sunmayı amaçlar. Basit bir konsol uygulaması olarak yapılandırılmıştır ve modüler bir yapı üzerine inşa edilmiştir. Sistem, kullanıcı etkileşimlerini yönetmek ve verilerin düzenli bir şekilde kaydını sağlamak için tasarlanmıştır.

## Proje Özellikleri

### Kullanıcı İşlevleri
- Yeni müşteri ekleme
- Yeni film ekleme
- Yeni salon oluşturma
- Belirli bir salondaki filmleri listeleme
- Belirli bir salondaki müşterileri listeleme

### Sınıf ve Arayüz Yapısı
- **BaseEntity**: Ortak özellikler (`id`, `name`) ve soyut `BilgiGoster` metodunu içerir.
- **Musteri**: Müşteri bilgilerini tutar ve `IKayit` arayüzünü uygular.
- **Film**: Filmin adı, süresi ve türü gibi bilgileri içerir.
- **Salon**: Salon bilgilerini, müşterileri ve gösterilen filmleri tutar. Ayrıca `IKayit` arayüzünü uygular.
- **SalonKayitSistemi**: Salonların yönetimini sağlar.
- **SinemaSistemi**: Ana sınıftır ve konsol üzerinden kullanıcı etkileşimini sağlar.

### Polimorfizm (Çok Biçimlilik)
`BaseEntity` sınıfında tanımlanan soyut `BilgiGoster` metodu, `Musteri` ve `Salon` sınıflarında override edilmiştir.

### Arayüz (Interface)
`IKayit` arayüzü, `kayitYap` metodunu içerir ve müşteri ve salon sınıflarında uygulanmıştır.

### Maven Yapılandırması
Proje, Maven kullanılarak yapılandırılmıştır. **pom.xml** dosyasında gerekli bağımlılıklar tanımlanmıştır. JUnit kullanılarak birim testler yapılmıştır.

## Kurulum ve Kullanım

### Gereksinimler
- Java 8 veya üzeri
- Maven 3.6 veya üzeri



# SinemaMusteriKayitSistemi

