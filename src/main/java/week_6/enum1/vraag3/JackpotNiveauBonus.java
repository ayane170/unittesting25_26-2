package week_6.enum1.vraag3;

public class JackpotNiveauBonus {
    public static void main(String[] args) {
        JackpotNiveau jn = JackpotNiveau.GOUD;

        JackpotNiveauType(jn);
    }

    public static void JackpotNiveauType(JackpotNiveau jn) {
        switch (jn) {
            case GOUD:
                System.out.println("JackpotNiveau GOUD");
                break;
            case ZILVER:
                System.out.println("JackpotNiveau ZILVER");
                break;
            case BRONZ:
                System.out.println("JackpotNiveau BRONZ");
                break;
        }

    }

}
