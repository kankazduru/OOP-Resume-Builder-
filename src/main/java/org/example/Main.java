package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. İş Deneyimleri (3 Adet)
        Experience exp1 = new Experience("Huawei Student Developers (HSD)", "Core Team Üyesi", "2025 - Devam Ediyor");
        Experience exp2 = new Experience("Erasmus+ Proje Katılımcısı", "Gönüllü/Öğrenci", "Almanya");
        Experience exp3 = new Experience("Kaptan Saros Turizm", "Barista", "2026");

        List<Experience> deneyimListesi = new ArrayList<>();
        deneyimListesi.add(exp1);
        deneyimListesi.add(exp2);
        deneyimListesi.add(exp3);

        // 2. Eğitim Bilgileri
        List<String> egitimListesi = Arrays.asList(
                "Kırklareli Üniversitesi - Yazılım Mühendisliği (2025-2029)",
                "Uzunköprü Fen Lisesi (2021-2025)"
        );

        // 3. Teknik Yetenekler
        List<String> yetenekListesi = Arrays.asList(
                "Programlama Dilleri: C, Java, HTML",
                "Geliştirme Ortamları: CLion, WebStorm, IntelliJ IDEA, Eclipse, VS Code",
                "Versiyon Kontrol: GitHub"
        );

        // 4. Projeler
        List<String> projeListesi = Arrays.asList(
                "API Request Scheduler (C, Min-Heap): Öncelik tabanlı istek yönlendirme simülasyonu.",
                "Syslog Simulator (C, Linked List): Log kayıtlarının bağlı liste ile yönetilmesi.",
                "Güneş Sistemi Web Projesi (HTML): Temalı bilgilendirici arayüz tasarımı."
        );

        // 5. Kişi Nesnesini Oluşturma
        Person duru = new Person(
                "Duru Kankaz",
                "durukankazz@gmail.com",
                "+90 553 802 78 13",
                "Edirne/Uzunköprü",
                "linkedin.com/in/durukankaz",
                "Kendini sürekli geliştirmeyi hedefleyen, Erasmus ve yurt dışında yüksek lisans planları olan 2. sınıf Yazılım Mühendisliği öğrencisi.",
                egitimListesi,
                yetenekListesi,
                projeListesi,
                deneyimListesi,
                "İngilizce: A2",
                "Voleybol oynamak, enstrüman çalmak ve şarkı söylemek.",
                "odev vesikalık fotograf.jpeg"
        );

        // 6. PDF Üretimi
        PdfGenerator uretici = new PdfGenerator();
        uretici.ozgecmisOlustur(duru, "Ozgecmis.pdf");

        System.out.println("Detaylı Özgeçmiş PDF dosyası başarıyla oluşturuldu!");
    }
}