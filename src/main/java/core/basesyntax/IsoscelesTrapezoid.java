package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;
    private final String name = "IsoscelesTrapezoid";

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + ", firstSide: " + sideA + " units, "
                + "secondSide: " + sideB + " units, "
                + "color: " + color);
    }
}
