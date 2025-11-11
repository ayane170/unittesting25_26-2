package week_6.enum1.vraag1;

public class Week {

    public static void main(String[] args) {
        Dagen dag = Dagen.ZATERDAG;
        printDagType(dag);


    }
    public static void printDagType (Dagen dag) {
        switch (dag) {
            case MAANDAG:
                System.out.println("weekDag");
                break;
            case DINSDAG:
                System.out.println("weekDag");
                break;
            case WOENSDAG:
                System.out.println("weekDag");
                break;
            case DONDERDAG:
                System.out.println("weekDag");
                break;
            case VRIJDAG:
                System.out.println("weekDag");
                break;
            case ZATERDAG:
                System.out.println("weekend");
                break;
            case ZONDAG:
                System.out.println("weekend");
                break;
        }
    }
//    public static void printDagType(Dagen dag) {
//        if (dag == Dagen.ZATERDAG || dag == Dagen.ZONDAG) {
//            System.out.println("weekend");
//        } else {
//            System.out.println("weekdag");
//        }
//    }
}
