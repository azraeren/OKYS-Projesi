public class Kullanici {
    private int id;
    private String ad;
    private String ePosta;
    private String sifre;

    public Kullanici(int id, String ad, String ePosta, String sifre) {
        this.id = id;
        this.ad = ad;
        this.ePosta = ePosta;
        this.sifre = sifre;
    }

    public int getId() { return id; }
    public String getAd() { return ad; }
    public String getEPosta() { return ePosta; }
    public String getSifre() { return sifre; }
}
