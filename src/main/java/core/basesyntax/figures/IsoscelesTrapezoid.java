package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height,
                              String name, String color) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", getArea: "
                + getArea() + " sq. units, sideA: " + sideA + " sq. units, sideB"
                + sideB + " units: color " + getColor());
    }
}
