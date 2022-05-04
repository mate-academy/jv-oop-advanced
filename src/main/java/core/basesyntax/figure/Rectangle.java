package core.basesyntax.figure;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
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
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("----------------------------"
                + "\n" + "Figure: rectangle"
                + "\n" + "Area: " + getArea() + " sq.units"
                + "\n" + "Side A: " + sideA + " units"
                + "\n" + "Side B: " + sideB + " units"
                + "\n" + "Color: " + getColor()
                + "\n" + "----------------------------" + "\n");

    }
}
