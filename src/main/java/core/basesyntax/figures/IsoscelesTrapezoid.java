package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height,
                              String name, String color) {
        super(name, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", getArea: "
                + getArea() + " sq. units, sideA: " + firstBase + " sq. units, sideB"
                + secondBase + " units: color " + getColor());
    }
}
