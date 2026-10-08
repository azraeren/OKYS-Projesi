import java.util.ArrayList;
import java.util.List;

public class Uye extends Kullanici {
    private List<OduncAlma> okudugumKitaplar;

    public Uye(int id, String ad, String ePosta, String sifre) {
        super(id, ad, ePosta, sifre);
        this.okudugumKitaplar = new ArrayList<>();
    }

    public void oduncKaydiEkle(OduncAlma kayit) {
        this.okudugumKitaplar.add(kayit);
    }

    public List<OduncAlma> getOkudugumKitaplar() {
        return okudugumKitaplar;
    }
}