package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double)(topSide + bottomSide) / 2 * height;
    }

    @Override
    public String draw() {
        return ("Figure: trapezoid, area: " + getArea()
                + " sq.units, top side: " + topSide + " units, bottom side: "
                + bottomSide + " units, height: " + height + " units, color: " + getColor());
    }
}
