package core.basesyntax;

public class RightTriangle extends Figure {
    private final double sideB;

    public RightTriangle(String color, double side, double sideB) {
        super(color, side);
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return 0.5 * getSide() * sideB;
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, "
                       + "sideA: %.1f units, sideB: %.1f units, color: %s\n",
                "right triangle", getArea(), getSide(), sideB, getColor());
    }
}
