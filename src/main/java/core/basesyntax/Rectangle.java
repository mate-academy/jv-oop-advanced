package core.basesyntax;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;
    private final String name = "Rectangle";

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area " + getArea()
                + " firstSide: " + sideA + "sq. units, " + "secondSide: "
                + sideB + "sq.units, " + "color: " + color);
    }
}
