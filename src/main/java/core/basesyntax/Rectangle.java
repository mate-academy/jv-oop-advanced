package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.setColor(color);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: rectangle, area: " + area()
                + " sq.units, sideA: " + getSideA()
                + ", sideB: " + getSideB()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return sideA * sideB;
    }
}
