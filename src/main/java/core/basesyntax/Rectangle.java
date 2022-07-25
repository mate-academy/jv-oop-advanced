package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, "
                       + "sideA: %.1f units, sideB: %.1f units, color: %s\n",
                "rectangle", getArea(), sideA, sideB, getColor());
    }
}
