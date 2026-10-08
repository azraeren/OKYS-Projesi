public class Main {
    public static void main(String[] args) {
        System.out.println("=== ONLINE KÜTÜPHANE YÖNETİM SİSTEMİ (OKYS) ===");

        // 1. Üye ve Görevli Oluşturma
        Uye uye1 = new Uye(1, "Ahmet Yılmaz", "ahmet@mail.com", "12345");
        KutupHaneGorevlisi gorevli = new KutupHaneGorevlisi(2, "Ayşe Memur", "ayse@kutuphane.edu.tr", "admin123");

        System.out.println("Üye Kaydedildi: " + uye1.getAd());
        System.out.println("Görevli Kaydedildi: " + gorevli.getAd());

        // 2. Kitap ve Kopyalarını Oluşturma
        Kitap kitap1 = new Kitap("978-975-05-0001", "Nutuk", "Mustafa Kemal Atatürk", 1927, "Ödünç Verilebilir");
        kitap1.kopyaEkle("BARKOD-001");
        kitap1.kopyaEkle("BARKOD-002");

        System.out.println("\nKitap Bilgisi: " + kitap1.kitapBilgisi());
        System.out.println("Fiziksel Kopya Sayısı: " + kitap1.getFizikselKopyalar().size());

        // 3. Ödünç Alma İşlemi
        KitapKopyasi alinacakKopya = kitap1.getFizikselKopyalar().get(0);
        OduncAlma odunc1 = new OduncAlma(1001, "07.10.2026", "21.10.2026", uye1, alinacakKopya);

        System.out.println("\n--- Ödünç Alma Kaydı ---");
        odunc1.oduncBilgisiGoster();
    }
}