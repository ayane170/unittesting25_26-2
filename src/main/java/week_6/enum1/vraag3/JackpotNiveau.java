package week_6.enum1.vraag3;

public enum JackpotNiveau {
    BRONZ(10,"bruin"),
    ZILVER(50,"grijs"),
    GOUD(100,"geel");

    private int minInzet;
    private  String kleur;

    private JackpotNiveau(int minInzet, String kleur ) {
       this.minInzet = minInzet;
       this.kleur = kleur;
    }

    public int getMinInzet() {
        return minInzet;
    }

    public String getKleur() {
        return kleur;
    }
}
