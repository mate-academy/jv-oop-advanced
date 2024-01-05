package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private final String color;

    Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea()
                        + " sq. units, a: " + this.sideA
                        + " units, b: " + this.sideB
                        + " units, color: " + this.color);
    }

    @Override
    double getArea() {
        return sideA * sideB;
    }
}
