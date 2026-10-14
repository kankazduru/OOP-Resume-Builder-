package org.example;

import java.util.List;

public class Person {
    private String adSoyad;
    private String email;
    private String telefon;
    private String ikamet;
    private String linkedin;
    private String ozet;
    private List<String> egitimBilgileri;
    private List<String> yetenekler;
    private List<String> projeler;
    private List<Experience> deneyimler;
    private String yabanciDil;
    private String ilgiAlanlari;
    private String fotografYolu;

    public Person(String adSoyad, String email, String telefon, String ikamet, String linkedin, String ozet, List<String> egitimBilgileri, List<String> yetenekler, List<String> projeler, List<Experience> deneyimler, String yabanciDil, String ilgiAlanlari, String fotografYolu) {
        this.adSoyad = adSoyad;
        this.email = email;
        this.telefon = telefon;
        this.ikamet = ikamet;
        this.linkedin = linkedin;
        this.ozet = ozet;
        this.egitimBilgileri = egitimBilgileri;
        this.yetenekler = yetenekler;
        this.projeler = projeler;
        this.deneyimler = deneyimler;
        this.yabanciDil = yabanciDil;
        this.ilgiAlanlari = ilgiAlanlari;
        this.fotografYolu = fotografYolu;
    }

    public String getAdSoyad() { return adSoyad; }
    public String getEmail() { return email; }
    public String getTelefon() { return telefon; }
    public String getIkamet() { return ikamet; }
    public String getLinkedin() { return linkedin; }
    public String getOzet() { return ozet; }
    public List<String> getEgitimBilgileri() { return egitimBilgileri; }
    public List<String> getYetenekler() { return yetenekler; }
    public List<String> getProjeler() { return projeler; }
    public List<Experience> getDeneyimler() { return deneyimler; }
    public String getYabanciDil() { return yabanciDil; }
    public String getIlgiAlanlari() { return ilgiAlanlari; }
    public String getFotografYolu() { return fotografYolu; }
}