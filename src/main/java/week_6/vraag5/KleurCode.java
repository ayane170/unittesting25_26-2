package week_6.vraag5;

import week_6.enum1.vraag3.JackpotNiveau;

import java.util.Optional;

public enum KleurCode implements Codering {


    ROOD("#FF0000"),
    GROEN("#008000"),
    BLAUW("#0047AB");

    private String hexadecimaleCode;

    private KleurCode(String hexadecimaleCode) {
        this.hexadecimaleCode = hexadecimaleCode;
    }

    @Override
    public String getHexCode() {
        return hexadecimaleCode;
    }

    public String getRGBValue(){
        String hex = getHexCode();
        String clean = hex.startsWith("#") ? hex.substring(1) : hex;

        int r = Integer.parseInt(clean.substring(0, 2), 16);
        int g = Integer.parseInt(clean.substring(2, 4), 16);
        int b = Integer.parseInt(clean.substring(4, 6), 16);
        return "R:" + r + ", G:" + g + ", B:" + b;
    }

    public static Optional<KleurCode> fromHexCode(String hexCode) {
        if (hexCode == null) {
            return Optional.empty();
        }

        for (KleurCode kleur : KleurCode.values()) {
            if (kleur.getHexCode().equalsIgnoreCase(hexCode)) {
                return Optional.of(kleur);
            }
        }

        return Optional.empty();
    }
}
