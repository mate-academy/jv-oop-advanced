package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double findArea() {
        return sideA * sideB;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: rectangle, area: %.1f sq.units, sideA: %.1f units, "
                + "sideB: %.1f units, color: %s\n", findArea(), sideA, sideB, super.getColor());
    }
}
