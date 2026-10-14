package org.example;

public class Experience {
    // 1. Değişkenler (Erişim düzenleyici olarak 'private' kullanıldı)
    private String sirketAdi;
    private String pozisyon;
    private String yil;

    // 2. Constructor (Yapıcı Metot) - Nesne yaratılırken ilk değerleri vermek için
    public Experience(String sirketAdi, String pozisyon, String yil) {
        this.sirketAdi = sirketAdi;
        this.pozisyon = pozisyon;
        this.yil = yil;
    }

    // 3. Getter ve Setter Metotları ('public' kullanılarak dışarıdan kontrollü erişim sağlandı)
    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public String getYil() {
        return yil;
    }

    public void setYil(String yil) {
        this.yil = yil;
    }
}
