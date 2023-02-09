package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.1f sq.units, "
                + "sideA: %.1f units, sideB: %.1f units, color: %s",
                area(), sideA, sideB, color.toLowerCase());
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

}
