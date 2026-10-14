package org.example;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PdfGenerator {

    public void ozgecmisOlustur(Person kisi, String dosyaYolu) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(dosyaYolu));
            document.open();

            BaseFont bf = BaseFont.createFont("Helvetica", "Cp1254", BaseFont.NOT_EMBEDDED);
            Font isimFont = new Font(bf, 22, Font.BOLD);
            Font baslikFont = new Font(bf, 14, Font.BOLD);
            Font normalFont = new Font(bf, 11, Font.NORMAL);
            Font kucukFont = new Font(bf, 10, Font.NORMAL);

            // 1. İsim ve Fotoğraf
            try {
                Image fotograf = Image.getInstance(kisi.getFotografYolu());
                fotograf.scaleToFit(100, 100);
                fotograf.setAlignment(Element.ALIGN_CENTER);
                document.add(fotograf);
            } catch (Exception e) {
                document.add(new Paragraph("(Fotoğraf eklenemedi)", kucukFont));
            }

            Paragraph adSoyad = new Paragraph(kisi.getAdSoyad(), isimFont);
            adSoyad.setAlignment(Element.ALIGN_CENTER);
            document.add(adSoyad);

            // 2. İletişim Bilgileri
            Paragraph iletisim = new Paragraph(
                    kisi.getEmail() + " | " + kisi.getTelefon() + "\n" +
                            kisi.getIkamet() + " | " + kisi.getLinkedin(), kucukFont
            );
            iletisim.setAlignment(Element.ALIGN_CENTER);
            document.add(iletisim);
            document.add(new Paragraph(" "));

            // 3. Özet (Hakkımda)
            document.add(new Paragraph("HAKKIMDA", baslikFont));
            document.add(new Paragraph("--------------------------------------------------"));
            document.add(new Paragraph(kisi.getOzet(), normalFont));
            document.add(new Paragraph(" "));

            // 4. Eğitim
            document.add(new Paragraph("EĞİTİM", baslikFont));
            document.add(new Paragraph("--------------------------------------------------"));
            for (String egitim : kisi.getEgitimBilgileri()) {
                document.add(new Paragraph("- " + egitim, normalFont));
            }
            document.add(new Paragraph(" "));

            // 5. Yetenekler
            document.add(new Paragraph("TEKNİK YETENEKLER", baslikFont));
            document.add(new Paragraph("--------------------------------------------------"));
            for (String yetenek : kisi.getYetenekler()) {
                document.add(new Paragraph("- " + yetenek, normalFont));
            }
            document.add(new Paragraph(" "));

            // 6. Projeler
            document.add(new Paragraph("PROJELER", baslikFont));
            document.add(new Paragraph("--------------------------------------------------"));
            for (String proje : kisi.getProjeler()) {
                document.add(new Paragraph("- " + proje, normalFont));
            }
            document.add(new Paragraph(" "));

            // 7. İş ve Gönüllü Deneyimler
            document.add(new Paragraph("DENEYİM VE GÖNÜLLÜ ÇALIŞMALAR", baslikFont));
            document.add(new Paragraph("--------------------------------------------------"));
            for (Experience exp : kisi.getDeneyimler()) {
                document.add(new Paragraph("- " + exp.getSirketAdi() + " | " + exp.getPozisyon() + " (" + exp.getYil() + ")", normalFont));
            }
            document.add(new Paragraph(" "));

            // 8. Dil ve İlgi Alanları
            document.add(new Paragraph("YABANCI DİL & İLGİ ALANLARI", baslikFont));
            document.add(new Paragraph("--------------------------------------------------"));
            document.add(new Paragraph("- " + kisi.getYabanciDil(), normalFont));
            document.add(new Paragraph("- " + kisi.getIlgiAlanlari(), normalFont));

            document.close();

        } catch (DocumentException | IOException e) {
            System.out.println("PDF oluşturulurken bir hata meydana geldi: " + e.getMessage());
        }
    }
}