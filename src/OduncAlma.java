public class OduncAlma {
    private int islemNo;
    private String oduncTarihi;
    private String sonTeslimTarihi;
    private String teslimTarihi;
    
    private Uye uye;
    private KitapKopyasi kitapKopyasi;

    public OduncAlma(int islemNo, String oduncTarihi, String sonTeslimTarihi, Uye uye, KitapKopyasi kitapKopyasi) {
        this.islemNo = islemNo;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.teslimTarihi = "Henüz Teslim Edilmedi";
        this.uye = uye;
        this.kitapKopyasi = kitapKopyasi;
        
        uye.oduncKaydiEkle(this);
    }

    public void oduncBilgisiGoster() {
        System.out.println("İşlem No: " + islemNo + 
                " | Üye: " + uye.getAd() + 
                " | Kitap: " + kitapKopyasi.getKitap().getBaslik() + 
                " (Barkod: " + kitapKopyasi.getBarkodNo() + ")" +
                " | Ödünç Tarihi: " + oduncTarihi + 
                " | Son Teslim: " + sonTeslimTarihi + 
                " | Teslim Durumu: " + teslimTarihi);
    }
}