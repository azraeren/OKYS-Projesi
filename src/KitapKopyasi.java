public class KitapKopyasi {
    private String barkodNo;
    private Kitap kitap;

    public KitapKopyasi(String barkodNo, Kitap kitap) {
        this.barkodNo = barkodNo;
        this.kitap = kitap;
    }

    public String getBarkodNo() { return barkodNo; }
    public Kitap getKitap() { return kitap; }
}