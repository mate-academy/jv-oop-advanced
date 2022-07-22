package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideB;

    public Rectangle(String color, double side, double sideB) {
        super(color, side);
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return getSide() * sideB;
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, "
                       + "sideA: %.1f units, sideB: %.1f units, color: %s\n",
                "rectangle", getArea(), getSide(), sideB, getColor());
    }
}
