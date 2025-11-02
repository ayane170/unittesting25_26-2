package week5;

import java.util.HashSet;
import java.util.Objects;

public class Punt_twee {
    private int x;
    private int y;

    public Punt_twee(int x, int y) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Punt_twee p = (Punt_twee) obj;
        return this.x == p.x && this.y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Punt_twee p1 = new Punt_twee(3, 5);
        Punt_twee p2 = new Punt_twee(3, 5);
        HashSet<Punt_twee> set1 = new HashSet<>();
        set1.add(p1);
        set1.add(p2);
        System.out.println("Test 1 - Size (equall) : " + set1.size());
        Punt_twee p3 = new Punt_twee(1, 2);
        Punt_twee p4 = new Punt_twee(3, 5);
        HashSet<Punt_twee> set2 = new HashSet<>();
        set2.add(p3);
        set2.add(p4);
        System.out.println("Test 2 - Size (diff) : " + set2.size());
    }
}
