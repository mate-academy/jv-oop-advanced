package core.basesyntax;

public class RightTriangle extends Figure {
    private final double side;

    public RightTriangle(double side, Color color) {
        this.side = side;
        setColor(color);
    }

    /**
     * Area of right triangle = side^2 * square root of 3
     */
    @Override
    public double getArea() {
        return (side * side) * Math.sqrt(3);
    }

    @Override
    public String draw() {
        return "Figure: right triangle Area: " + getArea() + " sq.units "
                + "Side: " + side + " units"
                + " Color: " + getColor() + "\n";
    }
}
