package week_6.enum1.vraag2;

 enum VerkeersLicht {
    ROOD(30),
    GEEL(10),
    GROEN(20);

    private int duurSeconden;

    private VerkeersLicht(int seconden) {
        this.duurSeconden = seconden;
    }

    public int getDuurSeconden() {
        return duurSeconden;
    }
}
