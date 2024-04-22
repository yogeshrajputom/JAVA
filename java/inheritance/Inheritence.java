package java.inheritance;

/**
 * Inheritence
 */

class car {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("this is inheritance");
        this.x = x;
    }
}

class Yoge extends Car {
    int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }
}

public class Inheritence {
    public static void main(String[] arga) {
        Base.b = new Base();
        b.setx(4);
        System.out.println(b.getx();

    }

}