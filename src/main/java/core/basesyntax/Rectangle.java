package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        toString();
    }

    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, color: " + getColor();
    }
}
