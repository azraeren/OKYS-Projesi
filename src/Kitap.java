import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;
    private List<KitapKopyasi> fizikselKopyalar;

    public Kitap(String isbn, String baslik, String yazar, int yayinYili, String durum) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = durum;
        this.fizikselKopyalar = new ArrayList<>();
    }

    public void kopyaEkle(String barkodNo) {
        KitapKopyasi yeniKopya = new KitapKopyasi(barkodNo, this);
        this.fizikselKopyalar.add(yeniKopya);
    }

    public String kitapBilgisi() {
        return "ADI: " + this.baslik + " | YAZARI: " + this.yazar + 
               " | YAYIN YILI: " + this.yayinYili + " | ISBN: " + this.isbn + 
               " | DURUM: " + this.durum;
    }

    public String getBaslik() { return baslik; }
    public String getYazar() { return yazar; }
    public String getIsbn() { return isbn; }
    public List<KitapKopyasi> getFizikselKopyalar() { return fizikselKopyalar; }
}