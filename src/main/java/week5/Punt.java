package week5;

import java.util.HashSet;

public class Punt {
    private int x;
    private int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;
        Punt p = (Punt) obj;
        return this.x == p.x && this.y == p.y;
    }

    public static void main(String[] args) {
        Punt p1 = new Punt(3, 5);
        Punt p2 = new Punt(3, 5);

        HashSet<Punt> punten = new HashSet<>();
        punten.add(p1);
        punten.add(p2);

        System.out.println("Grootte van HashSet: " + punten.size());
    }
}
